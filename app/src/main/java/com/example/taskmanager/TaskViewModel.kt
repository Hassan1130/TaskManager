package com.example.taskmanager

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TaskViewModel(val taskDao: TaskDao) : ViewModel() {
    val tasks: Flow<List<Task>> = taskDao.getAllTasks()

    fun addTask(title: String, description: String) = viewModelScope.launch {
        val newTask = Task(title = title, description = description)
        taskDao.insertTask(newTask)
    }

    fun deleteTask(task: Task) = viewModelScope.launch {
        taskDao.deleteTask(task)
    }
}
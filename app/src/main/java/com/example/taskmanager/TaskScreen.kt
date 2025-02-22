package com.example.taskmanager

import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun TaskScreen(viewModel: TaskViewModel) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    val tasks by viewModel.tasks.collectAsState(initial = emptyList())

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") }
        )
        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") }
        )
        Button(onClick = {
            viewModel.addTask(title, description)
            title = ""
            description = ""
        }, modifier = Modifier.padding(top = 8.dp)) {
            Text("Add Task")
        }

        LazyColumn {
            items(tasks) { task ->
                TaskItem(task, viewModel)
            }
        }
    }
}

@Composable
fun LazyColumn(content: @Composable () -> items) {
    TODO("Not yet implemented")
}

@Composable
fun Button(onClick: () -> Unit, modifier: padding, content: @Composable () -> Text) {
    TODO("Not yet implemented")
}
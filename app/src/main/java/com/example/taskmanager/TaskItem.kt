package com.example.taskmanager

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Divider
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun TaskItem(task: Task, viewModel: TaskViewModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = task.title, style = MaterialTheme.typography.headlineSmall)
            Text(text = task.description, style = MaterialTheme.typography.bodyMedium)
        }
        IconButton(onClick = { viewModel.deleteTask(task) }) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete")
        }
    }
    Divider() // Add a divider between items
}

fun Modifier.Companion.fillMaxWidth() {
    TODO("Not yet implemented")
}

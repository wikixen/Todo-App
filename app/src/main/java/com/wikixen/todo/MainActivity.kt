package com.wikixen.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wikixen.todo.sampleData.sampleTodos
import com.wikixen.todo.ui.TodoScreen
import com.wikixen.todo.ui.components.TodoDialog
import com.wikixen.todo.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoTheme {
                TodoScreen(sampleTodos)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TodoPreview() {
    TodoTheme {
        TodoScreen(sampleTodos)
    }
}
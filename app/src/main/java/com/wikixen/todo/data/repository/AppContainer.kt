package com.wikixen.todo.data.repository

import android.content.Context
import com.wikixen.todo.data.local.TodoDB

interface AppContainer {
    val todoRepository: TodoRepository
}

class AppDataContainer(private val context: Context): AppContainer {
    override val todoRepository: TodoRepository by lazy {
        OfflineTodoRepository(TodoDB.getDB(context).todoDao())
    }
}
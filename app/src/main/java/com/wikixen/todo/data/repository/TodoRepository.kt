package com.wikixen.todo.data.repository

import com.wikixen.todo.data.local.Todo
import kotlinx.coroutines.flow.Flow

interface TodoRepository {
    suspend fun getAllTodos(): Flow<List<Todo>>

    suspend fun insertTodo(todo: Todo)

    suspend fun updateTodo(todo: Todo)

    suspend fun deleteTodo(todo: Todo)
}
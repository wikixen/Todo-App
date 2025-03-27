package com.wikixen.todo.data.repository

import com.wikixen.todo.data.local.TodoDao
import com.wikixen.todo.data.local.Todo
import kotlinx.coroutines.flow.Flow

class OfflineTodoRepository(private val todoDao: TodoDao): TodoRepository {
    override suspend fun getAllTodos(): Flow<List<Todo>> = todoDao.getAllTodos()

    override suspend fun insertTodo(todo: Todo) = todoDao.insertTodo(todo)

    override suspend fun updateTodo(todo: Todo) = todoDao.updateTodo(todo)

    override suspend fun deleteTodo(todo: Todo) = todoDao.deleteTodo(todo)
}
package com.wikixen.todo.sampleData

import com.wikixen.todo.domain.models.Todo

val sampleTodos: List<Todo> = listOf(
    Todo(
        task = "Create todo app",
        complete = false,
    ),
    Todo(
        task = "Create todo screen",
        complete = true,
    ),
    Todo(
        task = "Create todo DAO",
        complete = false,
    ),
    Todo(
        task = "Create todo card",
        complete = true,
    ),
    Todo(
        task = "Publish on Github",
        complete = false,
    ),
)
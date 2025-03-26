package com.wikixen.todo.domain.models

data class Todo(
    val task: String,
    var complete: Boolean = false
)

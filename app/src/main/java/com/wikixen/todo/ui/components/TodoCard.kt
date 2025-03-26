package com.wikixen.todo.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.wikixen.todo.domain.models.Todo

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TodoCard(todo: Todo) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .border(border = BorderStroke(1.dp, Color.Black), shape = CardDefaults.shape)
            .combinedClickable(
                onClick = { /*TODO(Single click should select a todo)*/ },
                onDoubleClick = {todo.complete = !todo.complete},
                onLongClick = { /*TODO(Long click should allow for editing todos)*/ },
            ),
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
        ){
            Text(text = todo.task)
        }
    }
}
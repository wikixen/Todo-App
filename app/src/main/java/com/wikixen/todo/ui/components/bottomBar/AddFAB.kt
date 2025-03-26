package com.wikixen.todo.ui.components.bottomBar

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun AddFAB(
    onClick:()-> Unit,
    icon: ImageVector,
    desc: String
) {
    FloatingActionButton(
        onClick = { onClick() },
        elevation = FloatingActionButtonDefaults.elevation(1.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = desc
        )
    }
}
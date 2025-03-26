package com.wikixen.todo.ui.components.bottomBar

import androidx.compose.ui.graphics.vector.ImageVector

data class TabItem(
    val tabName: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)

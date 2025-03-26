package com.wikixen.todo.ui.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    selectedTab: Int,
) {
    TopAppBar(
        title = {
            if (selectedTab == 0) {
                Text("Current Tasks")
            } else Text("Completed Tasks")
        }
    )
}
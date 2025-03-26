package com.wikixen.todo.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.wikixen.todo.domain.models.Todo
import com.wikixen.todo.ui.components.bottomBar.AddFAB
import com.wikixen.todo.ui.components.bottomBar.BotTabs
import com.wikixen.todo.ui.components.bottomBar.TabItem
import com.wikixen.todo.ui.components.TodoCard
import com.wikixen.todo.ui.components.TopBar

@Composable
fun TodoScreen(
    todoList: List<Todo>,
    modifier: Modifier = Modifier
) {

    val tabItems = listOf<TabItem>(
        TabItem(
            tabName = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home
        ),
        TabItem(
            tabName = "Completed",
            selectedIcon = Icons.Filled.Done,
            unselectedIcon = Icons.Outlined.Done
        ),
    )

    // 0 means home tab, 1 means completed tasks tab
    var selectedTab by remember {
        mutableIntStateOf(0)
    }
    
    val addTodo = fun(){
//        TODO(Add dialog open here)
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { TopBar(selectedTab = selectedTab) },
        floatingActionButton = { AddFAB(
            { addTodo },
            icon = Icons.Filled.Add,
            desc = "Create Todo"
        ) },
        bottomBar = { BotTabs(
            tabItems = tabItems,
            onClick = { selectedTab = it},
            selectedTab = selectedTab,
            modifier = modifier
        ) }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier
                .padding(innerPadding)
        ) {
            if (selectedTab == 0) {
                items(todoList.filter { it.complete == false }.size) {i ->
                    TodoCard(todoList.filter { it.complete == false }[i])
                }
            } else {
                items(todoList.filter { it.complete == true }.size) {i ->
                    TodoCard(todoList.filter { it.complete == true }[i])
                }
            }
        }
    }
}
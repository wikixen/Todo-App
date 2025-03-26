package com.wikixen.todo.ui.components.bottomBar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BotTabs(
    tabItems: List<TabItem>,
    onClick: (Int) -> Unit,
    selectedTab: Int,
    modifier: Modifier = Modifier
    
) {
    PrimaryTabRow(
        selectedTabIndex = selectedTab,
        modifier = modifier
    ) {
        tabItems.forEachIndexed { index, item ->
            Tab(
                selected = index == selectedTab,
                onClick = { onClick(index) },
                icon = {
                    Icon(
                        imageVector = if (index == selectedTab) {
                            item.selectedIcon
                        } else item.unselectedIcon,
                        contentDescription = item.tabName
                    )
                },
                text = { Text(item.tabName) },
            )
        }
    }
}
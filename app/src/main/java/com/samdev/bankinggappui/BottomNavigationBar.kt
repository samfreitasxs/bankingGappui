package com.samdev.bankinggappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.samdev.bankinggappui.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Notifications",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Account",
        icon = Icons.Rounded.AccountCircle
    ),
)

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row (
            modifier = Modifier.background((MaterialTheme.colorScheme.inverseOnSurface))
        ){

        }
    }
}








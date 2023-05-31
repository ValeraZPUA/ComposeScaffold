package com.example.bottomnavcompose.bottomNavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MyBottomNavigation(
    navController: NavController
) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2,
        BottomItem.Screen3,
        BottomItem.Screen4
    )

    BottomNavigation(
        backgroundColor = Color.White
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach { bottomItem ->
            BottomNavigationItem(
                selected = currentRoute == bottomItem.route,
                icon = {
                    Icon(
                        painter = painterResource(id = bottomItem.iconId),
                        contentDescription = "icon"
                    )
                },
                label = {
                    Text(
                        text = bottomItem.title,
                        fontSize = 9.sp
                    )
                },
                onClick = {
                    navController.navigate(bottomItem.route)
                },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.LightGray
            )
        }
    }
}
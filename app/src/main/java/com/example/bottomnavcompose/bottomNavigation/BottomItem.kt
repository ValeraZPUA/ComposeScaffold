package com.example.bottomnavcompose.bottomNavigation

import com.example.bottomnavcompose.R

sealed class BottomItem(
    val title: String,
    val iconId: Int,
    val route: String
) {

    object Screen1 : BottomItem(
        title = "Screen 1",
        iconId = R.drawable.icon,
        route = "screen_1"
    )

    object Screen2 : BottomItem(
        title = "Screen 2",
        iconId = R.drawable.icon,
        route = "screen_2"
    )

    object Screen3 : BottomItem(
        title = "Screen 3",
        iconId = R.drawable.icon,
        route = "screen_3"
    )

    object Screen4 : BottomItem(
        title = "Screen 4",
        iconId = R.drawable.icon,
        route = "screen_4"
    )

}

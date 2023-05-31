package com.example.bottomnavcompose.bottomNavigation

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavcompose.topAppBar.MyTopAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            MyTopAppBar()
        },
        bottomBar = {
            MyBottomNavigation(navController = navController)
        }
    ) {
        NavGraph(navHostController = navController)
    }

}
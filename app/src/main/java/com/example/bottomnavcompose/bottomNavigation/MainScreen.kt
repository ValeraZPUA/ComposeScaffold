package com.example.bottomnavcompose.bottomNavigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            MyBottomNavigation(navController = navController)
        }
    ) {
        NavGraph(navHostController = navController)
    }

}
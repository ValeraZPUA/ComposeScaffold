package com.example.bottomnavcompose.bottomNavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavcompose.topAppBar.MyTopAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = { host ->
            SnackbarHost(
                hostState = host
            ) { data ->
                Snackbar(
                    backgroundColor = Color.Red,
                    snackbarData = data,
                    shape = RoundedCornerShape(20.dp),
                    contentColor = Color.LightGray
                )
            }
        },
        topBar = {
            MyTopAppBar(scope, scaffoldState)
        },
        bottomBar = {
            MyBottomNavigation(navController = navController)
        }
    ) {
        NavGraph(navHostController = navController)
    }

}
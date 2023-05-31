package com.example.bottomnavcompose.topAppBar

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MyTopAppBar(scope: CoroutineScope, scaffoldState: ScaffoldState) {
    TopAppBar(
        title = {
            Text(text = "Menu")
        },
        backgroundColor = Color.White,
        navigationIcon = {
            IconButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Side menu"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "Share"
                )
            }
            IconButton(
                onClick = {
                    scope.launch {
                        val result = scaffoldState.snackbarHostState.showSnackbar(
                            message = "Message has been deleted",
                            actionLabel = "Undone"
                        )
                        if (result == SnackbarResult.ActionPerformed) {
                            scaffoldState.snackbarHostState.showSnackbar(
                                message = "Message recovered!"
                            )
                        }
                    }
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = "Delete"
                )
            }
        }
    )
}
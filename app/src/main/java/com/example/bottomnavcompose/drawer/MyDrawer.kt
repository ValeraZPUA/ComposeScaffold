package com.example.bottomnavcompose.drawer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.LightGray
            )
            .height(170.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Header",
            fontSize = 20.sp
        )
    }
}

@Composable
fun DrawerBody(scope: CoroutineScope, scaffoldState: ScaffoldState) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(5) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {

                    }
                    .padding(10.dp)
                    .clickable {
                        scope.launch {
                            scaffoldState.drawerState.close()
                        }
                    },
                text = "Menu item $it"
            )
        }
    }
}
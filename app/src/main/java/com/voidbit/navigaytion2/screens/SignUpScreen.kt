package com.voidbit.navigaytion2.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.voidbit.navigaytion2.nav.RootScreen

@Composable
fun SignUpScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "Go Back")
            }
            Button(onClick = {
                navController.navigate(RootScreen.Dashboard.route){
                    popUpTo(RootScreen.Register.Login.route){
                        inclusive = true
                    }
                }
            }) {
                Text(text = "Go to Dashboard")
            }
        }

    }
}
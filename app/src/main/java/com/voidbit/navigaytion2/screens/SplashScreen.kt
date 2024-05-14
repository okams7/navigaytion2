package com.voidbit.navigaytion2.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.voidbit.navigaytion2.nav.RootScreen

@Composable
fun SplashScreen(
    navHostController: NavHostController
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            navHostController.navigate(RootScreen.Register.route){
                popUpTo(RootScreen.Splash.route){
                    inclusive = true
                }
            }
        }) {
            Text(text = "Go to register screen")
        }
    }
}
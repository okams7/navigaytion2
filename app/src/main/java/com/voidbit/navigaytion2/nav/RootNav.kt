package com.voidbit.navigaytion2.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.voidbit.navigaytion2.screens.DashboardScreen
import com.voidbit.navigaytion2.screens.LoginScreen
import com.voidbit.navigaytion2.screens.SignUpScreen
import com.voidbit.navigaytion2.screens.SplashScreen


@Composable
fun RootNavigation() {

    val navHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = RootScreen.Splash.route
    ) {

        composable(RootScreen.Splash.route) {
            SplashScreen(navHostController)
        }

        navigation(
            route = RootScreen.Register.route,
            startDestination = RootScreen.Register.Login.route
        ){
            composable(RootScreen.Register.Login.route){
                LoginScreen(navHostController)
            }
            composable(RootScreen.Register.Signup.route){
                SignUpScreen(navHostController)
            }
        }

        navigation(
            route = RootScreen.Dashboard.route,
            startDestination = RootScreen.Dashboard.Home.route
        ){
            composable(RootScreen.Dashboard.Home.route){
                DashboardScreen()
            }
        }

    }

}

sealed class RootScreen(val route: String) {
    object Splash : RootScreen("splash")

    object Register : RootScreen("register") {
        object Login : RootScreen("login")
        object Signup : RootScreen("signup")
    }
    object Dashboard : RootScreen("dashboard"){
        object Home : RootScreen("home")
    }
}
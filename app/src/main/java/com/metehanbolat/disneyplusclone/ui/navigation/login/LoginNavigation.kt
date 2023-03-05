package com.metehanbolat.disneyplusclone.ui.navigation.login

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.metehanbolat.disneyplusclone.ui.login_screen.LoginWithEmailScreen
import com.metehanbolat.disneyplusclone.ui.login_screen.WelcomeScreen
import com.metehanbolat.disneyplusclone.ui.splash_screen.SplashScreen

@Composable
fun LoginNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WelcomePage.WelcomeScreen.route) {
        composable(route = WelcomePage.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = WelcomePage.WelcomeScreen.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = WelcomePage.LoginWithEmailScreen.route) {
            LoginWithEmailScreen(navController = navController)
        }
    }
}
package com.metehanbolat.disneyplusclone.ui.navigation.login

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.metehanbolat.disneyplusclone.ui.login_screen.SignInScreen
import com.metehanbolat.disneyplusclone.ui.splash_screen.SplashScreen

@Composable
fun LoginNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WelcomePage.LoginScreen.route) {
        composable(route = WelcomePage.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = WelcomePage.LoginScreen.route) {
            SignInScreen()
        }
    }
}
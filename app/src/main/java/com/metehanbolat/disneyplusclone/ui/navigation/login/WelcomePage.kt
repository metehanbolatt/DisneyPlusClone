package com.metehanbolat.disneyplusclone.ui.navigation.login

sealed class WelcomePage(val route: String) {
    object SplashScreen: WelcomePage("splash_screen")
    object LoginScreen: WelcomePage("login_screen")
}
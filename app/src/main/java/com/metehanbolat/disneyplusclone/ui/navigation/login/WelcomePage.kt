package com.metehanbolat.disneyplusclone.ui.navigation.login

sealed class WelcomePage(val route: String) {
    object SplashScreen: WelcomePage("splash_screen")
    object WelcomeScreen: WelcomePage("welcome_screen")
    object LoginWithEmailScreen: WelcomePage("login_with_email_screen")
    object LoginPasswordScreen: WelcomePage("login_password_screen")
    object CheckEmailScreen: WelcomePage("check_email_screen")
}
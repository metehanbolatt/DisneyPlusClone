package com.metehanbolat.disneyplusclone.ui.splash_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.metehanbolat.disneyplusclone.R
import com.metehanbolat.disneyplusclone.ui.navigation.login.WelcomePage
import com.metehanbolat.disneyplusclone.ui.theme.DarkBlue
import com.metehanbolat.disneyplusclone.ui.theme.LightBlue
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController
) {
    val compositeResult by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.disney_plus)
    )
    val progressAnimation by animateLottieCompositionAsState(
        composition = compositeResult,
        isPlaying = true,
        speed = 1.0f,
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        DarkBlue,
                        LightBlue
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = compositeResult,
            progress = progressAnimation
        )

        LaunchedEffect(key1 = true) {
            delay(3000)
            navController.navigate(WelcomePage.LoginScreen.route) {
                popUpTo(WelcomePage.SplashScreen.route) { inclusive = true }
            }
        }

    }

}
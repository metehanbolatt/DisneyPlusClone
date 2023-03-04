package com.metehanbolat.disneyplusclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.disneyplusclone.ui.navigation.login.LoginNavigation
import com.metehanbolat.disneyplusclone.ui.theme.DisneyPlusCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyPlusCloneTheme {
                LoginNavigation()
            }
        }
    }
}
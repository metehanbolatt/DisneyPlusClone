package com.metehanbolat.disneyplusclone.ui.login_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.metehanbolat.disneyplusclone.R
import com.metehanbolat.disneyplusclone.ui.theme.CursorColor
import com.metehanbolat.disneyplusclone.ui.theme.InputBackgroundColor
import com.metehanbolat.disneyplusclone.ui.theme.InputFieldIndicatorColor
import com.metehanbolat.disneyplusclone.ui.theme.InputFieldLabelColor
import com.metehanbolat.disneyplusclone.ui.theme.RememberPasswordTextColor
import com.metehanbolat.disneyplusclone.ui.theme.SignInButtonColor

@Composable
fun LoginPasswordScreen(
    navController: NavHostController
) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(color = Color.Transparent)

    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            modifier = Modifier
                .padding(start = 10.dp, top = 15.dp)
                .clip(CircleShape)
                .background(Color.White)
                .clickable(role = Role.Button) {
                    navController.popBackStack()
                },
            imageVector = Icons.Default.KeyboardArrowLeft,
            contentDescription = "Back Button"
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier.size(width = 120.dp, height = 90.dp),
                    painter = painterResource(id = R.drawable.disney_plus_logo),
                    contentDescription = "App Logo"
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "E-postanızla oturum açın",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.avenir_heavy))
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = password,
                onValueChange = { password = it },
                label = {
                    Text(
                        text = "Parola"
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.LightGray,
                    backgroundColor = InputBackgroundColor,
                    cursorColor = CursorColor,
                    focusedLabelColor = InputFieldLabelColor,
                    unfocusedLabelColor = InputFieldLabelColor,
                    focusedIndicatorColor = InputFieldIndicatorColor
                ),
                maxLines = 1,
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val image =
                        if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    val description = if (passwordVisible) "Hide Password" else "Show Password"
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            imageVector = image,
                            contentDescription = description,
                            tint = InputFieldLabelColor
                        )
                    }
                }
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = SignInButtonColor
                ),
                onClick = {

                }
            ) {
                Text(
                    text = "OTURUM AÇ",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Parolanızı mı Unuttunuz?",
                fontFamily = FontFamily(Font(R.font.avenir_roman)),
                fontSize = 16.sp,
                color = RememberPasswordTextColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPasswordScreenPreview() {
    val navController = rememberNavController()
    LoginPasswordScreen(navController = navController)
}
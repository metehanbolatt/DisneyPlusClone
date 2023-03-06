package com.metehanbolat.disneyplusclone.ui.login_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.metehanbolat.disneyplusclone.R
import com.metehanbolat.disneyplusclone.ui.navigation.login.WelcomePage
import com.metehanbolat.disneyplusclone.ui.theme.CursorColor
import com.metehanbolat.disneyplusclone.ui.theme.InputBackgroundColor
import com.metehanbolat.disneyplusclone.ui.theme.InputFieldIndicatorColor
import com.metehanbolat.disneyplusclone.ui.theme.InputFieldLabelColor
import com.metehanbolat.disneyplusclone.ui.theme.SignInButtonColor
import com.metehanbolat.disneyplusclone.ui.theme.SignUpTextColor

@Composable
fun CheckEmailScreen(
    navController: NavHostController
) {

    var emailCode by remember { mutableStateOf("") }

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
                text = "E-posta gelen kutunuzu kontrol edin",
                color = Color.White,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.avenir_heavy))
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "E-posta adresinizi doğrulamamız gerekiyor. ******@gmail.com adresine, geçerliliği 15 dakika sonra sona erecek 6 ahneli bir kod içeren bir e-posta gönderdik. Lütfen kodu aşağıya girin.",
                color = InputFieldLabelColor,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.avenir_roman)),
                lineHeight = 25.sp,
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = emailCode,
                onValueChange = { emailCode = it },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.LightGray,
                    backgroundColor = InputBackgroundColor,
                    cursorColor = CursorColor,
                    focusedLabelColor = InputFieldLabelColor,
                    unfocusedLabelColor = InputFieldLabelColor,
                    focusedIndicatorColor = InputFieldIndicatorColor
                ),
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = SignInButtonColor
                ),
                onClick = {
                    navController.navigate(WelcomePage.LoginPasswordScreen.route)
                }
            ) {
                Text(
                    text = "DEVAM ET",
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "E-postayı almadınız mı? Önemsiz veya istenmeyen e-posta klasörlerinizi kontrol edin.",
                color = InputFieldLabelColor,
                fontFamily = FontFamily(Font(R.font.avenir_roman)),
                fontSize = 15.sp,
                lineHeight = 25.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                modifier = Modifier.clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ) {
                    println("Tıkladı")
                },
                text = "Tekrar Gönder",
                color = SignUpTextColor,
                fontFamily = FontFamily(Font(R.font.avenir_heavy))
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CheckEmailPreviewScreen() {
    val navController = rememberNavController()
    CheckEmailScreen(navController = navController)
}
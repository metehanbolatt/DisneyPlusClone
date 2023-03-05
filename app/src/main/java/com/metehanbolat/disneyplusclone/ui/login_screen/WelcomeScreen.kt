package com.metehanbolat.disneyplusclone.ui.login_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.metehanbolat.disneyplusclone.R
import com.metehanbolat.disneyplusclone.ui.navigation.login.WelcomePage
import com.metehanbolat.disneyplusclone.ui.theme.DarkBlue
import com.metehanbolat.disneyplusclone.ui.theme.SignInButtonColor

@Composable
fun WelcomeScreen(
    navController: NavHostController
) {
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(color = DarkBlue)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
    ) {
        Box(
            modifier = Modifier
                .height(530.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.movies),
                contentDescription = "Movies",
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .height(530.dp)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                DarkBlue
                            )
                        )
                    )
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.disney_plus_logo),
                    contentDescription = "App Logo"
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Dünyanın en iyi hikayeleri. Hepsi bir yerde.",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.disney_logo),
                        contentDescription = "Disney Logo"
                    )
                    Icon(
                        modifier = Modifier
                            .size(20.dp)
                            .weight(0.7f),
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.White
                    )
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.pixar_logo),
                        contentDescription = "Pixar Logo"
                    )
                    Icon(
                        modifier = Modifier
                            .size(20.dp)
                            .weight(0.7f),
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.White
                    )
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.marvel_logo),
                        contentDescription = "Marvel Logo"
                    )
                    Icon(
                        modifier = Modifier
                            .size(20.dp)
                            .weight(0.7f),
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.White
                    )
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.star_wars_logo),
                        contentDescription = "Star Wars Logo"
                    )
                    Icon(
                        modifier = Modifier
                            .size(20.dp)
                            .weight(0.7f),
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add Icon",
                        tint = Color.White
                    )
                    Image(
                        modifier = Modifier.weight(1f),
                        painter = painterResource(id = R.drawable.national_geographic_logo),
                        contentDescription = "National Geographic Logo"
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(horizontal = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = SignInButtonColor
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "ŞİMDİ ÜYE OL",
                        color = Color.White
                    )
                }
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp),
                    text = "₺34,99/ay karşılığında üye olun ya da yıllık üyelik\n için sadece ₺349,90/yıl ödeyerek %15 tasarruf edin.",
                    color = Color.White.copy(alpha = 0.6f),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.body2.copy(
                        lineHeight = 23.sp
                    )
                )
                Divider(
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                        .background(Color.DarkGray)
                )
                Text(
                    modifier = Modifier
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) {
                            navController.navigate(WelcomePage.LoginWithEmailScreen.route)
                        },
                    text = "OTURUM AÇ",
                    color = Color.White,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview() {
    val navController = rememberNavController()
    WelcomeScreen(navController = navController)
}
package com.example.socialmediaapp.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmediaapp.R
import com.example.socialmediaapp.common.LOGO_SPLASH_DESCRIPTION


@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        val scale = remember {
            androidx.compose.animation.core.Animatable(0f)
        }


        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = LOGO_SPLASH_DESCRIPTION
        )

    }
}
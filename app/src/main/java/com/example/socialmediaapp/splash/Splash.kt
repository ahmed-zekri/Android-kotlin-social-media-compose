package com.example.socialmediaapp.splash


import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmediaapp.R
import com.example.socialmediaapp.common.LOGO_SPLASH_DESCRIPTION
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        val scaleToggle = produceState(initialValue = false) {
            while (true) {
                delay(500)
                value = !value

            }
        }
        val scale = remember {
            androidx.compose.animation.core.Animatable(0f)
        }
        LaunchedEffect(key1 = scaleToggle.value) {
            scale.animateTo(
                targetValue = if (scaleToggle.value) 1.2f else 0f, animationSpec = TweenSpec(
                    durationMillis = 200
                )
            )

        }

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = LOGO_SPLASH_DESCRIPTION,
            modifier = Modifier.scale(scale = scale.value)
        )

    }
}
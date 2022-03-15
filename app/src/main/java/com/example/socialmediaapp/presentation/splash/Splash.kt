package com.example.socialmediaapp.presentation.splash


import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmediaapp.R
import com.example.socialmediaapp.common.LOGO_SPLASH_DESCRIPTION
import com.example.socialmediaapp.presentation.utils.Screen
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        var times by remember {
            mutableStateOf(0)
        }
        val scaleToggle = produceState(initialValue = false) {
            while (times < 3) {
                delay(500)
                value = !value
                times = times.plus(1)


            }
            navController.popBackStack()
            navController.navigate(Screen.LoginScreen.route)
        }
        val scale = remember {
            androidx.compose.animation.core.Animatable(0f)
        }
        LaunchedEffect(key1 = scaleToggle.value) {
            scale.animateTo(
                targetValue = if (scaleToggle.value) 1.2f else 0f, animationSpec = TweenSpec(
                    durationMillis = 1000
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
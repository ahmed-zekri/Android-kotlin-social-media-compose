package com.example.socialmediaapp.presentation.utils

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialmediaapp.presentation.login.Login
import com.example.socialmediaapp.presentation.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(Screen.SplashScreen.route)
        {
            SplashScreen(navController)

        }

        composable(Screen.LoginScreen.route)
        {
            Login(navController = navController)

        }

    }
}
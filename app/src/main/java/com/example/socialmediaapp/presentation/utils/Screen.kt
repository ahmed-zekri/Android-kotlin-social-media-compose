package com.example.socialmediaapp.presentation.utils

import com.example.socialmediaapp.common.LOGIN_SCREEN_ROUTE
import com.example.socialmediaapp.common.SPLASH_SCREEN_ROUTE

sealed class Screen(val route: String) {
    object SplashScreen : Screen(SPLASH_SCREEN_ROUTE)
    object LoginScreen : Screen(LOGIN_SCREEN_ROUTE)
    object RegisterScreen : Screen(SPLASH_SCREEN_ROUTE)
}
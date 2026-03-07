package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screens.SingUpScreen
import com.example.myapplication.screens.WelcomeScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ){

        composable("welcome"){
            WelcomeScreen(navController)
        }

        composable("signup"){
            SingUpScreen(navController)
        }
    }
}
package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController){

    Column{
        Text("este es el inicio")

        Button(
            onClick = {
                navController.navigate("re")
            }
        ) {
            Text("crear cuenta")
        }
    }
}






























































































































































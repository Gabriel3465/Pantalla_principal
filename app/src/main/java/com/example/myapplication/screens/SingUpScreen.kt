package com.example.myapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SingUpScreen(navController: NavController){

    Column{
        Text("esta es la pantalla de crear cuenta")

        Button(
            onClick = {
                navController.navigate("welcome")
            }
        ) {
            Text("volver")
        }
    }
}
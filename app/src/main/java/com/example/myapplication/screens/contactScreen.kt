package com.example.myapplication.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.components.Contact
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

data class Contacto(val nombre: String, val telefono: String)

@Composable
fun ContactScreen(navController: NavController) {

    var nombre by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }

    var contactos by remember {
        mutableStateOf(listOf<Contacto>())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Contactos")

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = telefono,
            onValueChange = { telefono = it },
            label = { Text("Teléfono") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {
            if (nombre.isNotEmpty() && telefono.isNotEmpty()) {
                contactos = contactos + Contacto(nombre, telefono)
                nombre = ""
                telefono = ""
            }
        }) {
            Text("Agregar contacto")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(contactos) { contacto ->
                Contact(contacto.nombre, contacto.telefono)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate("welcome")
        }) {
            Text("Volver")
        }
    }
}
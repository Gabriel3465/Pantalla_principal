package com.example.myapplication.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListItemExample(){
    val frutas = listOf("Manzana", "pera", "uva", "naranja", "mandarina")

    LazyColumn() {
        items(frutas){
            fruta ->
            Text(
                text = fruta,
                modifier = Modifier.padding(16.dp)
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ListItemExamplePreview(){
    ListItemExample()
}
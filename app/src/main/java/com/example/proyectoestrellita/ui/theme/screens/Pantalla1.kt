package com.example.proyectoestrellita.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.proyectoestrellita.R.drawable.hampter

@Composable
fun Pantalla1(navController: NavHostController) {

    Column(

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){

        Image(
            painter = painterResource(id = hampter ),
            contentDescription = "sad hampter",
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Yo al ver todas las tareas que me quedan pendientes")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("Pantalla2") }) {
            Text(text = "Ir a pantalla 2")
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { navController.navigate("Pantalla3") }) {
            Text(text = "Ir a pantalla 3")
        }
    }
}
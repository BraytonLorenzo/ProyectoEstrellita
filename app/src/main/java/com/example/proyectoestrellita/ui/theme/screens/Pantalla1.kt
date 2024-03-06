package com.example.proyectoestrellita.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.proyectoestrellita.R
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
            contentDescription = "sad hampter"
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Ir a pantalla 2")
        }

    }

}
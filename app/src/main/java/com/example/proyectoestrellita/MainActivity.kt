package com.example.proyectoestrellita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoestrellita.ui.theme.ProyectoEstrellitaTheme
import com.example.proyectoestrellita.ui.theme.screens.Pantalla1
import com.example.proyectoestrellita.ui.theme.screens.Pantalla2
import com.example.proyectoestrellita.ui.theme.screens.Pantalla3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoEstrellitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EstrellitaApp()
                }
            }
        }
    }
}

@Composable
fun EstrellitaApp() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Pantalla1") {

        composable("Pantalla1") {

            Pantalla1(navController)

        }

        composable("Pantalla2") {

            Pantalla2(navController)

        }

        composable("Pantalla3") {

            Pantalla3(navController)

        }
    }
}

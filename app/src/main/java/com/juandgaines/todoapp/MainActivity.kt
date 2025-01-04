package com.juandgaines.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.juandgaines.todoapp.presentation.navegation.NavigationRoot
import com.juandgaines.todoapp.ui.theme.TodoAppTheme
import dagger.hilt.android.AndroidEntryPoint

// @AndroidEntryPoint se utiliza para indicar que MainActivity es un punto de entrada para la inyección de dependencias con Hilt. Esto permite que Hilt inyecte dependencias en MainActivity.
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppTheme() {
                val navController = rememberNavController()
                NavigationRoot(navController)
            }
        }
    }
}
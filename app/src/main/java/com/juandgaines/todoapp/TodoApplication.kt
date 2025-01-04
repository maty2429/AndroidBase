package com.juandgaines.todoapp

import android.app.Application
import com.juandgaines.todoapp.domain.TaskLocalDataSource
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

//a anotación @HiltAndroidApp se utiliza para indicar que la clase TodoApplication es el punto de entrada para la inyección de dependencias con Hilt en toda la aplicación. Esto permite que Hilt gestione la inyección de dependencias en toda la aplicación.
@HiltAndroidApp
class TodoApplication:Application() // aplication se refiere a la clase base de android que se encarga de inicializar la aplicación, el estado global de la aplicación y la configuración de la aplicación.
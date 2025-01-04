package com.juandgaines.todoapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)//Especifica que las dependencias proporcionadas por este módulo estarán disponibles en el componente de nivel de aplicación (SingletonComponent), lo que significa que las instancias serán únicas y compartidas en toda la aplicación.
class AppModule {

    // Proporciona una instancia de CoroutineDispatcher que usa el Dispatcher.IO
    @Provides
    @Named("dispatcherIO")
    fun provideDispatcherIO(): CoroutineDispatcher = Dispatchers.IO //dispatchers.io es para gestionar tareas en segundo plano, operaciones de entrada salida

    // Proporciona una instancia de CoroutineDispatcher que usa el Dispatcher.Main
    @Provides
    @Named("dispatcherMain")
    fun provideDispatcherMain(): CoroutineDispatcher = Dispatchers.Main // Dispatchers.Main se utiliza para operaciones de IU que se ejcutan en el hilo principal de la UI.
}
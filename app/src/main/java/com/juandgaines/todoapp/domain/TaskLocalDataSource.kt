package com.juandgaines.todoapp.domain

import kotlinx.coroutines.flow.Flow

interface TaskLocalDataSource {
    val tasksFlow: Flow<List<Task>>
    suspend fun addTask(task: Task)
    suspend fun updateTask(updatedTask: Task)
    suspend fun removeTask(task: Task)
    suspend fun deleteAllTasks()
    suspend fun getTaskById(taskId: String): Task?
    suspend fun removeAllTasks()
}
/*
se utiliza para tasksFlow con el fin de proporcionar un flujo reactivo de listas de tareas.
 Esto permite que la aplicación observe los cambios en la lista de tareas en tiempo real.
 Cada vez que se agregan, actualizan o eliminan tareas,
 el Flow emite la lista actualizada a cualquier observador
 , asegurando que la interfaz de usuario u otros componentes puedan reaccionar a estos cambios de inmediato.
 */
package com.juandgaines.todoapp.presentation.home

import com.juandgaines.todoapp.domain.Task

data class HomeDataState(
    val date:String = "",
    val summary:String =  "",
    val completedTask:List<Task> = emptyList(),
    val pendingTask:List<Task> = emptyList(),
)
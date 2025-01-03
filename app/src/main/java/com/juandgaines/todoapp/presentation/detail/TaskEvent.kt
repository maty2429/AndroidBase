package com.juandgaines.todoapp.presentation.detail

sealed interface TaskEvent{
    data object TaskCreated: TaskEvent
}

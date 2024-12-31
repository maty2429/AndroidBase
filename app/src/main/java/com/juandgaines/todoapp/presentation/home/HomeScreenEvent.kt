package com.juandgaines.todoapp.presentation.home

sealed interface HomeScreenEvent{
    data object UpdatedTask:HomeScreenEvent
    data object DeletedTask:HomeScreenEvent
    data object AllTaskDeleted:HomeScreenEvent
}
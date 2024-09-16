package com.example.gymtimer.presentation

import kotlinx.coroutines.flow.MutableStateFlow

enum class TimerState {
    RUNNING, PAUSED, RESET
}
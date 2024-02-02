package com.example.stateincompose

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

class WellnessTask(val id: Int,
                   val label: String,
                   initialChecked: Boolean = false
){
    var checked by mutableStateOf(initialChecked)
}

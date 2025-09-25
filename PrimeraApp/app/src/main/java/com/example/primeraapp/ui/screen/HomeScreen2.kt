package com.example.primeraapp.ui.screen

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import com.example.primeraapp.ui.utils.obtenerWindowSizeClass

@Composable
fun HomeScreen2(){
    val windowSizeClass = obtenerWindowSizeClass()
    when(windowSizeClass.widthSizeClass)
    WindowSizeClass.Compact -> HomeScreenCompacta()
    WindowSizeClass.Expanded -> HomeScreenExpandida()
}
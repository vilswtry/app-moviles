package com.example.primeraapp.ui.utils
import android.app.Activity
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun obtenerWindowSizeClass():WindowSizeClass{
    val activity = LocalContext.current as Activity
    return calculateWindowSizeClass(activity)
}
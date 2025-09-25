package com.example.primeraapp.ui.screen

import androidx.compose.foundation.Image
import com.example.primeraapp.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenCompacta() {
    Scaffold (
    topBar = {
        TopAppBar(title = { Text(text = "bienvenido") })
    }
    ){ innerPadding ->
        Column (
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .fillMaxSize()
                .padding(all = 16.dp)
            verticalArragement = Arragement.spaceBy(space=20.dp)
        ) {
            Text(
                text="bienvenido",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.titleLarge
            )
            Button (onClick = {}){
                Text( text = "Click me")
            }
            Image(
                painter= painterResource(id= R.drawable.descarga),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 150.dp),
                contentScale = ContentScale.Fit

            )
        }
    }
}

@Preview (name= "compacta", widthDp = 360, heightDp= 800)
@Composable
fun HomeScreenCompactaPreview(){
    HomeScreenCompacta()
}
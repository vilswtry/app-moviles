package com.example.primeraapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenExpandida(){
    Scaffold (
        topBar = {
            TopAppBar(title = { Text(text = "bienvenido") })
        }
    ){ innerPadding ->
        Row(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .fillMaxSize()
                .padding(all = 16.dp)
            horizontalArragement = Arragement.SpaceBetween
        ){
            Column(modifier = Modifier.weight(1f)){
                Text(text = "modo expandido", style = MaterialTheme.)
            }

        }
        }
    }


@Preview (name= "expander", widthDp = 1000, heightDp= 800)
@Composable
fun HomeScreenExpandidaPreview(){
    HomeScreenExpandida()
}
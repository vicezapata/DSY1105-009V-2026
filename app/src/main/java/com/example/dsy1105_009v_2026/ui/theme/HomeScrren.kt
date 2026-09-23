package com.example.dsy1105_009v_2026.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dsy1105_009v_2026.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
// Scaffold: permite generar una pantalla basica
    Scaffold (
        topBar={
            TopAppBar(title={ Text("Mi Primer App")})
        }// fin topBar


    ){ innerPadding ->
        //innerPadding  es un espacio interno que entrega Scaffold
        Column(
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ){  //inicio inner
            Text(text="!!!  Bienvenido !!!!!!")
            Button(onClick={/*  accion futura */}){
                Text("Presioname")
            }// fin text


            Image(
                painter= painterResource(id= R.drawable.logoduoc),
                contentDescription = "Logo Appp",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit

            )

        }//fin inner


    }



}// fin HomeScreen


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
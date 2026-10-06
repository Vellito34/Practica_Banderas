package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.jvm.Throws

@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .weight(.5f))
        Box(modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .weight(.5f))

    }
    Diagonales()
    TrianguloNegro()

}

@Preview
@Composable
fun BanderaSudafricaPreview() {
    BanderaSudafrica(modifier = Modifier.fillMaxSize())
}
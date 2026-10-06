package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.R

@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(colorResource(R.color.Amarillo)).fillMaxSize()) {
        TrianguloNaranja()
        LogoDragonButan()
    }
}

@Preview
@Composable
fun BanderaButanPreview() {
    BanderaButan(modifier = Modifier.fillMaxSize())
}
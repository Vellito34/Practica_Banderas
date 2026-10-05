package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.R

@Composable
fun BanderaReinoUnido(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(colorResource(R.color.Azul)),
        contentAlignment = Alignment.Center
    ) {
        Diagonales()
        LineaBlancaV()
        LineaBlancaH()
        LineaRojaV()
        LineaRojaH()
    }
}

@Preview
@Composable
fun BanderaReinoUnidoPreview() {
    BanderaReinoUnido(modifier = Modifier.fillMaxSize())
}

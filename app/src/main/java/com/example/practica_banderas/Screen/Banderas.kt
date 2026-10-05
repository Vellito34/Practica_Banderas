package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaPapua(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(Color.Red)) {
    TrianguloNegro(modifier = Modifier.fillMaxSize())}

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = (Alignment.Center)) {
        CruzDelSur()
    }
}

@Preview
@Composable
fun BanderaPapuaPreview() {
    BanderaPapua(modifier = Modifier.fillMaxSize())
}
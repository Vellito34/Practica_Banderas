package com.example.practica_banderas.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
        Box(modifier = Modifier.weight(1f)) {
            TrianguloSuperiorNepal()
            LogoLunaNepal()
        }
        Box(modifier = Modifier.weight(1f)) {
            TrianguloInferiorNepal()
            LogoSolNepal()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNepalPreview() {
    BanderaNepal(modifier = Modifier.fillMaxSize())
}
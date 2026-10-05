package com.example.practica_banderas.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    Box(modifier.aspectRatio(2f)) {
        AbanicoSeychelles(Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    BanderaSeychelles(modifier = Modifier.fillMaxSize())
}
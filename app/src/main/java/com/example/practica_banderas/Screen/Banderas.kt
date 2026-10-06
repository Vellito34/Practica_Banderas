package com.example.practica_banderas.Screen

import LogoKiribati
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaKiribati(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .background(Color.Red)
        ){LogoKiribati()}
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f),
        ) {
            repeat(6) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(
                            if (index % 2 == 0) Color.Blue else Color.White
                        )
                )
            }
        }
    }
}

@Preview
@Composable
fun BanderaKiribatiPreview() {
    BanderaKiribati(modifier = Modifier.fillMaxSize())
}
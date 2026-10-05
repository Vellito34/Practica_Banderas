package com.example.practica_banderas.Screen

import LogoIsrael
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .fillMaxSize()
        .background(Color.White)) {
        Box(
            modifier = Modifier
                .weight(0.2f).fillMaxWidth()
                .background(Color.Blue)
        )

        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight(.6f), contentAlignment = Alignment.Center){LogoIsrael()}

        Box(
            modifier = Modifier
                .weight(0.2f).fillMaxWidth()
                .background(Color.Blue)
        )
    }
}

@Preview
@Composable
fun BanderaPreview() {
    BanderaIsrael(modifier = Modifier.fillMaxSize())
}
package com.example.practica_banderas.Screen

import LogoTurquia
import android.R.attr.logo
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.R

@Composable
fun banderaTurquia(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(colorResource(R.color.rojo)),
        contentAlignment = Alignment.Center) {
        LogoTurquia(modifier = Modifier.fillMaxSize(0.5f))
    }
}

@Preview
@Composable
fun banderaTurquiaPreview() {
    banderaTurquia(modifier = Modifier.fillMaxSize())
}

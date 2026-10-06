package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Logo1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth(0.2f)
            .fillMaxHeight(0.62f)
            .background(Color.White)
    )
}

@Composable
fun Logo2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight(0.2f)
            .fillMaxWidth(0.62f)
            .background(Color.White)
    )
}
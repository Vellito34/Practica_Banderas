package com.example.practica_banderas.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (bandera) = createRefs()
        Box(modifier.constrainAs(bandera) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }) {
            AbanicoSeychelles(Modifier.fillMaxSize())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    BanderaSeychelles(modifier = Modifier.fillMaxSize())
}
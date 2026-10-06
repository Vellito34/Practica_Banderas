package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.practica_banderas.R

@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(colorResource(R.color.Amarillo))) {
        val (logo, tri) = createRefs()
        TrianguloNaranja(modifier = Modifier.constrainAs(tri) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        LogoDragonButan(modifier = Modifier.constrainAs(logo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)})
    }
}

@Preview
@Composable
fun BanderaButanPreview() {
    BanderaButan(modifier = Modifier.fillMaxSize())
}
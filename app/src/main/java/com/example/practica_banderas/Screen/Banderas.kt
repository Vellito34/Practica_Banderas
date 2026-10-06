package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.practica_banderas.R

@Composable
fun BanderaReino(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(colorResource(R.color.Azul))) {
        val (linerv, linerh,linev, lineh) = createRefs()
        Box(modifier = Modifier.constrainAs(linev) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

        }) {
            LineaBlancaV()
        }
        Box(modifier = Modifier.constrainAs(linerv) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

        }) {
            LineaRojaV()
        }

        Box(modifier = Modifier.constrainAs(lineh) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }) {
            LineaBlancaH()
        }

        Box(modifier = Modifier.constrainAs(linerh) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }) {
            LineaRojaH()
        }

        Diagonales()
    }
}

@Preview
@Composable
fun BanderaPreview() {
    BanderaReino(modifier = Modifier.fillMaxSize())
}
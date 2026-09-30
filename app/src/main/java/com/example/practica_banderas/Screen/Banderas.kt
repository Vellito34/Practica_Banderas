package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R

@Composable
fun BanderaAregentina(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxt, boxb, boxbo, escudo) = createRefs()
        val linet = createGuidelineFromTop(1 / 3f)
        val lineb = createGuidelineFromBottom(1 / 3f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.celes))
                .constrainAs(boxt) {
                    top.linkTo(parent.top)
                    bottom.linkTo(linet)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(boxb) {
                    top.linkTo(linet)
                    bottom.linkTo(lineb)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(colorResource(R.color.celes))
                .constrainAs(boxbo) {
                    top.linkTo(lineb)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Yellow)
                .constrainAs(escudo) {
                    top.linkTo(linet)
                    bottom.linkTo(lineb)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

    }
}

@Preview
@Composable
fun PreviewBandera() {
    BanderaAregentina(modifier = Modifier.fillMaxSize())
}
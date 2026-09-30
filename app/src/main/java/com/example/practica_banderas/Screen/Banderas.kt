package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaColombia(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = modifier) {
        val (boxt, boxm, boxb) = createRefs()
        val linet = createGuidelineFromTop(2/4f)
        val lineb = createGuidelineFromBottom(1/4f)

        Box(modifier = Modifier.background(Color.Yellow).constrainAs(boxt){
            top.linkTo(parent.top)
            bottom.linkTo(linet)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.Blue).constrainAs(boxm){
            top.linkTo(linet)
            bottom.linkTo(lineb)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.Red).constrainAs(boxb){
            top.linkTo(lineb)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
    }
}

@Preview
@Composable
fun banderaPreview(){
    BanderaColombia(modifier = Modifier.fillMaxSize())
}
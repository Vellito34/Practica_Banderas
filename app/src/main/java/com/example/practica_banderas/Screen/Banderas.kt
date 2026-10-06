package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(Color.Red)) {
        val (logo1,logo2) = createRefs()
        Logo1(modifier = Modifier.constrainAs(logo1){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })

        Logo2(modifier = Modifier.constrainAs(logo2){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
    }
}

@Preview
@Composable
fun BanderaSuizaPreview() {
    BanderaSuiza(modifier = Modifier.fillMaxSize())
}
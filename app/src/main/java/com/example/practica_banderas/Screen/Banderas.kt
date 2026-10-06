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
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (arriba,abajo) = createRefs()
        val linea = createGuidelineFromTop(0.5f)
        Box(modifier = Modifier.constrainAs(arriba) {
            top.linkTo(parent.top)
            bottom.linkTo(linea)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }.background(Color.Blue))
        Box(modifier = Modifier.constrainAs(abajo) {
            top.linkTo(linea)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }.background(Color.Yellow))

        TrianguloNegro()
    }
    Diagonales()

}

@Preview
@Composable
fun BanderaSudafricaPreview() {
    BanderaSudafrica(modifier = Modifier.fillMaxSize())
}
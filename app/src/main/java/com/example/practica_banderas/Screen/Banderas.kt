package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaPapun(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(Color.Red)) {
        val (tri, cruz) = createRefs()
        TrianguloNegro(modifier = Modifier.constrainAs(tri) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        CruzDelSur(modifier = Modifier.constrainAs(cruz) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }.size(100.dp))

    }
}

@Preview
@Composable
fun BanderaPapunPreview() {
    BanderaPapun(modifier = Modifier.fillMaxSize())
}
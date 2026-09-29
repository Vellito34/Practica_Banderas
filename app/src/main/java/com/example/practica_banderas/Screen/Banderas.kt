package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R

@Composable
fun BanderaAlemania(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxT, boxB, boxBo) = createRefs()
        val linet = createGuidelineFromTop(1 / 3f)
        val lineb = createGuidelineFromBottom(1 / 3f)

        Box(
            modifier = Modifier
                .background(Color.Black)
                .constrainAs(boxT) {
                    top.linkTo(parent.top)
                    bottom.linkTo(linet)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(colorResource(R.color.rojo))
                .constrainAs(boxB) {
                    top.linkTo(boxT.bottom)
                    bottom.linkTo(boxBo.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(colorResource(R.color.amarillo))
                .constrainAs(boxBo) {
                    top.linkTo(lineb)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })
    }
}

@Preview
@Composable
fun BanderaAlemaniaPreview() {
    BanderaAlemania(modifier = Modifier.fillMaxSize())
}
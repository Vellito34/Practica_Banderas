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
fun Banderakribati(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val lineC = createGuidelineFromTop(0.5f)
        val lineb = createGuidelineFromBottom(1 / 12f)
        val lineb2 = createGuidelineFromBottom(3 / 12f)
        val lineb3 = createGuidelineFromBottom(2 / 12f)
        val lineb4 = createGuidelineFromBottom(4 / 12f)
        val lineb5 = createGuidelineFromBottom(5 / 12f)
        val (logo, arriba, abajo, a2, a3, a4, a5, a6) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(arriba) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(lineC)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color.Red))

        Box(
            modifier = Modifier
                .constrainAs(abajo) {
                    top.linkTo(lineC)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color.White))

        Box(
            modifier = Modifier
                .constrainAs(a2) {
                    top.linkTo(lineb)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color.Blue))

        Box(
            modifier = Modifier
                .constrainAs(a3) {
                    top.linkTo(lineb2)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(lineb3)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color.Blue))

        Box(
            modifier = Modifier
                .constrainAs(a4) {
                    top.linkTo(lineb5)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(lineb4)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color.Blue))

        LogoKiribati(modifier = Modifier.constrainAs(logo) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(lineC)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
    }
}

@Preview
@Composable
fun BanderakribatiPreview() {
    Banderakribati(modifier = Modifier.fillMaxSize())
}
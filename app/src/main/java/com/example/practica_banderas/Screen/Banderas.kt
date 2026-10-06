package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R

@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(Color.White)) {
        val (lineT, lineBe, lineB, logo) = createRefs()
        val lineTop = createGuidelineFromTop(1 / 5f)
        val lineBottom = createGuidelineFromBottom(1 / 5f)
        val lineB1 = createGuidelineFromTop(2 / 5f)
        val lineB2 = createGuidelineFromBottom(2 / 5f)
        val center = createGuidelineFromStart(1 / 2f)
        Box(
            modifier = Modifier
                .constrainAs(lineT) {
                    top.linkTo(parent.top)
                    bottom.linkTo(lineTop)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(colorResource(R.color.azul)))

        Box(modifier = Modifier
            .constrainAs(lineBe) {
                top.linkTo(lineB1)
                bottom.linkTo(lineB2)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints

            }
            .background(colorResource(R.color.azul)))

        Box(
            modifier = Modifier
                .constrainAs(lineB) {
                    top.linkTo(lineBottom)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(colorResource(R.color.azul)))

        LogoCuba(Modifier
            .width(30.dp)
            .constrainAs(logo) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(center)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            })
    }


}

@Preview
@Composable
fun BanderaCubaPreview() {
    BanderaCuba(modifier = Modifier.fillMaxSize())
}
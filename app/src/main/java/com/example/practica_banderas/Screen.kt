package com.example.practica_banderas

import android.content.res.Resources
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaItalia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxL, boxR, boxB) = createRefs()
        val lineS = createGuidelineFromStart(0.33f)
        val lineE = createGuidelineFromEnd(0.33f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.green))
                .constrainAs(boxL) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(lineS)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(boxB) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(lineS)
                    end.linkTo(lineE)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })

        Box(
            modifier = Modifier
                .background(colorResource(R.color.red))
                .constrainAs(boxR) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(lineE)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })
    }
}

@Preview
@Composable
fun BanderaItaliaPreview() {
    BanderaItalia(modifier = Modifier.fillMaxSize())
}
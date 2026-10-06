package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(Color.White)) {
        val (lineT, lineB, linel) = createRefs()
        val lineTop = createGuidelineFromTop(0.15f)
        val lineBottom = createGuidelineFromBottom(0.15f)

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
                .background(colorResource(R.color.Azul))
        )

        LogoIsrael(modifier = Modifier.constrainAs(linel) {
            top.linkTo(lineTop)
            bottom.linkTo(lineBottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier
            .constrainAs(lineB) {
                top.linkTo(lineBottom)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
            .background(colorResource(R.color.Azul)))

    }
}


@Preview
@Composable
fun BanderaPreview() {
    BanderaIsrael(modifier = Modifier.fillMaxSize())
}
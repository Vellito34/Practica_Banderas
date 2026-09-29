package com.example.practica_banderas.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R

@Composable
fun BanderaEspaña(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxT, boxB, boxBo, boxL) = createRefs()
        val lineT = createGuidelineFromTop(1 / 4f)
        val lineB = createGuidelineFromBottom(1 / 4f)
        val lineS = createGuidelineFromStart(1 / 3f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.rojo))
                .constrainAs(boxT) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(lineT)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.amarillo))
                .constrainAs(boxB) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(lineT)
                    bottom.linkTo(lineB)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(R.color.rojo))
                .constrainAs(boxBo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(lineB)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                })
        Image(
            painter = painterResource(R.drawable.spain),
            contentDescription = "Escudo de España",
            modifier = Modifier
                .size(170.dp)
                .constrainAs(boxL) {
                    start.linkTo(lineS)
                    end.linkTo(lineS)
                    top.linkTo(lineT)
                    bottom.linkTo(lineB)
                }
        )
    }
}

@Preview
@Composable
fun BanderaEspañaPreview() {
    BanderaEspaña(modifier = Modifier.fillMaxSize())
}
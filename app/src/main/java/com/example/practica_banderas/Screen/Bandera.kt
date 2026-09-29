package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxL, boxR, boxB) = createRefs()
        val lineS = createGuidelineFromStart(0.33f)
        val lineE = createGuidelineFromEnd(0.33f)

        Box(
            modifier = Modifier
                .background(colorResource(R.color.VerdeMx))
                .constrainAs(boxL) {
                    start.linkTo(parent.start)
                    end.linkTo(lineS);
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Box(

            modifier = Modifier
                .background(Color.White)
                .constrainAs(boxB) {
                    start.linkTo(lineS)
                    end.linkTo(lineE)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                },
            contentAlignment = Alignment.Center

        ) {
            Image(
                painter = painterResource(R.drawable.coat_of_arms_of_mexico_svg),
                contentDescription = "Bandera"
            )
        }

        Box(
            modifier = Modifier
                .background(colorResource(R.color.RojoMx))
                .constrainAs(boxR) {
                    start.linkTo(lineE)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints

                }
        )

    }
}


@Preview
@Composable
fun BanderaMexicoPreview() {
    BanderaMexico(modifier = Modifier.fillMaxSize())
}
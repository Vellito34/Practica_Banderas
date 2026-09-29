package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (boxL, boxR, boxB) = createRefs()
        val lineS = createGuidelineFromStart(0.33f)
        val lineE = createGuidelineFromEnd(0.33f)

        Box(modifier = Modifier.constrainAs(boxL) {
            start.linkTo(parent.start)
            end.linkTo(lineS);
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }.background(colorResource(R.color.)) {}
    }
}


@Preview
@Composable
fun BanderaMexicoPreview() {
    BanderaMexico()
}
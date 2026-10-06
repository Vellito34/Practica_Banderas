package com.example.practica_banderas.Screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (triSup, triInf, luna, sol) = createRefs()
        val lineC = createGuidelineFromTop(0.5f)
        val lineC2 = createGuidelineFromStart(0.5f)

        TrianguloSuperiorNepal(modifier = Modifier.constrainAs(triSup) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(lineC2)
            bottom.linkTo(lineC)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        TrianguloInferiorNepal(modifier = Modifier.constrainAs(triInf) {
            top.linkTo(lineC)
            start.linkTo(parent.start)
            end.linkTo(lineC2)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        LogoLunaNepal(modifier = Modifier.constrainAs(luna) {
            top.linkTo(triSup.top)
            bottom.linkTo(triSup.bottom)
            start.linkTo(triSup.start)
            end.linkTo(triSup.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        LogoSolNepal(modifier = Modifier.constrainAs(sol) {
            top.linkTo(triInf.top)
            bottom.linkTo(triInf.bottom)
            start.linkTo(triInf.start)
            end.linkTo(triInf.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
    }
}


@Preview
@Composable
fun BanderaNepalPreview() {
    BanderaNepal(modifier = Modifier.fillMaxSize())
}
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun FranjaRoja(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val ref = createRef()
        Box(
            modifier = Modifier
                .constrainAs(ref) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(Color.Red)
        )
    }
}

@Composable
fun FranjaBlanca(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val ref = createRef()
        Box(
            modifier = Modifier
                .constrainAs(ref) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(Color.White)
        )
    }
}

@Composable
fun BanderaUSA(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val (f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13) = createRefs()
        val cantonAzul = createRef()

        createVerticalChain(
            f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13,
            chainStyle = ChainStyle.Spread
        )


        FranjaRoja(Modifier.constrainAs(f1) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f2) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f3) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f4) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f5) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f6) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f7) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f8) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f9) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f10) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f11) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaBlanca(Modifier.constrainAs(f12) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })
        FranjaRoja(Modifier.constrainAs(f13) {
            width = Dimension.matchParent; height = Dimension.fillToConstraints
        })

        Box(
            modifier = Modifier
                .constrainAs(cantonAzul) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(f7.bottom)
                    width = Dimension.percent(0.4f)
                    height = Dimension.fillToConstraints
                }
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaUSAPreview() {
    BanderaUSA(modifier = Modifier.fillMaxSize())
}
package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.practica_banderas.R


@Composable
fun BanderaBrasil(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(colorResource(R.color.verde))) {
        val RombosShape = GenericShape { size, _ ->
            moveTo(size.width / 2f, 0f)
            lineTo(size.width, size.height / 2f)
            lineTo(size.width / 2f, size.height)
            lineTo(0f, size.height / 2f)
            close()
        }
        ConstraintLayout(modifier = modifier) {

            val (logoa, logoc) = createRefs()

            Box(
                modifier = Modifier
                    .fillMaxSize(0.75f)
                    .clip(RombosShape).background(colorResource(R.color.Amarillo))
                    .constrainAs(logoa) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    })
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .clip(CircleShape)
                    .background(colorResource(R.color.Azul))
                    .constrainAs(logoc) {
                        top.linkTo(logoa.top)
                        start.linkTo(logoa.start)
                        end.linkTo(logoa.end)
                        bottom.linkTo(logoa.bottom)
                    })
        }
    }
}

@Preview
@Composable
fun BanderaBrasilPreview() {
    BanderaBrasil(modifier = Modifier.fillMaxSize())
}
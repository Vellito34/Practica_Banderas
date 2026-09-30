package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.practica_banderas.R

@Composable
fun BanderaJapon(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(Color.White).fillMaxSize()) {
        ConstraintLayout(modifier = modifier) {
            val logo = createRef()
            Box(modifier = Modifier
                .clip(CircleShape).size(200.dp)
                .background(Color.Red)
                .constrainAs(logo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                })
        }
    }
}

@Preview
@Composable
fun BanderaJaponPreview() {
    BanderaJapon(modifier = Modifier.fillMaxSize())
}
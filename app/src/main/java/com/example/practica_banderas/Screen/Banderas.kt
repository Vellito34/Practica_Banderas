package com.example.practica_banderas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.practica_banderas.R
import java.nio.file.WatchEvent

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.background(colorResource(R.color.Rojo))) {
        val logo = createRef()
        val linea = createGuidelineFromStart(20.dp)
        LogoTurquia(modifier = Modifier.size(300.dp).constrainAs(logo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(linea)
            end.linkTo(parent.end)
        })
    }
}

@Preview
@Composable
fun BanderaTurquiaPreview() {
    BanderaTurquia(modifier = Modifier.fillMaxSize())
}
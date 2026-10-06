package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import com.example.practica_banderas.R
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun LogoTurquia(modifier: Modifier = Modifier) {
    val rojo = colorResource(R.color.Rojo)
    Canvas(modifier = modifier.fillMaxSize()) {

        drawRect(color = rojo)

        val cy = size.height / 2f
        val rOut = size.height * 0.30f

        // Media luna
        drawCircle(
            color = Color.White, radius = rOut, center = Offset(size.width * 0.38f, cy)
        )
        drawCircle(
            color = rojo,
            radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
        )

        // Estrella de 5 puntas
        val starCx = size.width * 0.38f + size.height * 0.20f
        val starR = size.height * 0.12f        // radio externo
        val starr = starR * 0.382f             // radio interno (proporción de la estrella regular)

        val star = Path().apply {
            for (i in 0 until 10) {
                val radio = if (i % 2 == 0) starR else starr
                // -90° para que una punta apunte hacia arriba
                val ang = -PI / 2 + i * PI / 5
                val x = starCx + (radio * cos(ang)).toFloat()
                val y = cy + (radio * sin(ang)).toFloat()
                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }
        drawPath(path = star, color = Color.White)
    }
}
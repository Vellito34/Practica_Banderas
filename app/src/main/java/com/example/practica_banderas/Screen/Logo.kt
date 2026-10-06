package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.R
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun TrianguloNaranja(modifier: Modifier = Modifier) {
    // 1. Extraer el color fuera del Canvas
    val colorNaranja = colorResource(id = R.color.Naranja)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        val pathNaranja = Path().apply {
            moveTo(w, 0f)
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }

        drawPath(path = pathNaranja, color = colorNaranja)
    }
}

@Composable
fun LogoDragonButan(modifier: Modifier = Modifier) {

    val colorAmarillo = colorResource(id = R.color.Amarillo)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        val grosorZigzag = h * 0.08f
        val zigzagPath = Path().apply {
            moveTo(w * 0.30f, h * 0.65f)
            lineTo(w * 0.40f, h * 0.45f)
            lineTo(w * 0.50f, h * 0.55f)
            lineTo(w * 0.65f, h * 0.40f)
            lineTo(w * 0.75f, h * 0.50f)
            lineTo(w * 0.85f, h * 0.35f)
        }
        drawPath(
            path = zigzagPath,
            color = Color.White,
            style = Stroke(
                width = grosorZigzag,
                cap = StrokeCap.Round,
                join = StrokeJoin.Round
            )
        )

        val unionesDragones = listOf(
            Offset(w * 0.40f, h * 0.45f),
            Offset(w * 0.50f, h * 0.55f),
            Offset(w * 0.65f, h * 0.40f),
            Offset(w * 0.75f, h * 0.50f)
        )

        val radioCirculo = h * 0.06f
        val radioEstrella = h * 0.04f

        unionesDragones.forEach { punto ->
            drawCircle(
                color = Color.White,
                radius = radioCirculo,
                center = punto
            )

            dibujarEstrella(
                centro = punto,
                radioExterno = radioEstrella,

                color = colorAmarillo
            )
        }
    }
}

fun DrawScope.dibujarEstrella(centro: Offset, radioExterno: Float, color: Color) {
    val path = Path()
    val numPuntas = 5
    val radioInterno = radioExterno / 2.5f

    for (i in 0 until numPuntas * 2) {
        val radioActual = if (i % 2 == 0) radioExterno else radioInterno

        val anguloRad = Math.toRadians((i * 360.0 / (numPuntas * 2)) - 90.0)

        val x = centro.x + radioActual * cos(anguloRad).toFloat()
        val y = centro.y + radioActual * sin(anguloRad).toFloat()

        if (i == 0) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
    }
    path.close()
    drawPath(path = path, color = color)
}
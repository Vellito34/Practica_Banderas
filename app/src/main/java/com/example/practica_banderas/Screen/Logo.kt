package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.res.colorResource
import com.example.practica_banderas.R
import kotlin.math.sqrt


@Composable
fun LineaBlancaV(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth(0.3f)
            .fillMaxHeight(1f)
    )
}

@Composable
fun LineaRojaV(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(colorResource(R.color.Rojo))
            .fillMaxWidth(0.2f)
            .fillMaxHeight(1f)
    )
}

@Composable
fun LineaBlancaH(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth(1f)
            .fillMaxHeight(0.2f)
    )
}

@Composable
fun LineaRojaH(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(colorResource(R.color.Rojo))
            .fillMaxWidth(1f)
            .fillMaxHeight(0.1f)
    )
}

private fun DrawScope.diagonalRoja(
    esquina: Offset,
    centro: Offset,
    grosor: Float,
    desplazamiento: Float,
    color: Color                              // el color llega como parámetro
) {
    val dx = centro.x - esquina.x
    val dy = centro.y - esquina.y
    val largo = sqrt(dx * dx + dy * dy)
    val ux = dx / largo
    val uy = dy / largo
    val nx = -uy * desplazamiento
    val ny = ux * desplazamiento
    val extra = size.width * 0.1f

    drawLine(
        color = color,
        start = Offset(esquina.x - ux * extra + nx, esquina.y - uy * extra + ny),
        end = Offset(centro.x + nx, centro.y + ny),
        strokeWidth = grosor
    )
}

private const val FRACCION_DIAGONAL = 0.2f

private fun DrawScope.diagonal(
    esquina: Offset,
    centro: Offset,
    grosor: Float,
    desplazamiento: Float,
    color: Color
) {
    val dx = centro.x - esquina.x
    val dy = centro.y - esquina.y
    val largo = sqrt(dx * dx + dy * dy)
    val ux = dx / largo
    val uy = dy / largo
    val nx = -uy * desplazamiento
    val ny = ux * desplazamiento
    val extra = size.width * 0.1f

    drawLine(
        color = color,
        start = Offset(esquina.x - ux * extra + nx, esquina.y - uy * extra + ny),
        end = Offset(centro.x + nx, centro.y + ny),
        strokeWidth = grosor
    )
}
@Composable
fun Diagonales(modifier: Modifier = Modifier) {
    val rojoReino = colorResource(id = R.color.Rojo)

    Canvas(modifier = modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height

        // 1. Diagonales Blancas (Fondo)
        val grosorDiagonalBlanca = height * 0.1f
        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(width, height),
            strokeWidth = grosorDiagonalBlanca
        )
        drawLine(
            color = Color.White,
            start = Offset(width, 0f),
            end = Offset(0f, height),
            strokeWidth = grosorDiagonalBlanca
        )

        val grosorDiagonalRoja = height * 0.05f
        drawLine(
            color = rojoReino,
            start = Offset(0f, 0f),
            end = Offset(width, height),
            strokeWidth = grosorDiagonalRoja
        )
        drawLine(
            color = rojoReino,
            start = Offset(width, 0f),
            end = Offset(0f, height),
            strokeWidth = grosorDiagonalRoja
        )
    }
}
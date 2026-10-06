package com.example.practica_banderas.Screen


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import kotlin.math.sqrt
import androidx.compose.ui.graphics.Path

private fun DrawScope.diagonalRoja(
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
    val rojoReino = Color.Green

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

@Composable
fun TrianguloNegro(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val path = Path().apply {

            moveTo(0f, 0f)


            lineTo(size.width * 0.36f, size.height / 2f)

            lineTo(0f, size.height)

            close()
        }

        drawPath(path = path, color = Color.Black)
    }
}
package com.example.practica_banderas.Screen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import com.example.practica_banderas.R
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun TrianguloSuperiorNepal(modifier: Modifier = Modifier) {
    val azulBorde = colorResource(id = R.color.Azul)
    val rojoCarmesi = colorResource(id = R.color.Rojo)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val grosorBorde = w * 0.04f

        val pathSuperior = Path().apply {
            moveTo(0f, 0f)
            lineTo(w * 0.92f, h * 0.90f)
            lineTo(0f, h)
            close()
        }


        drawPath(path = pathSuperior, color = rojoCarmesi)


        drawPath(
            path = pathSuperior,
            color = azulBorde,
            style = Stroke(
                width = grosorBorde,
                join = StrokeJoin.Round
            )
        )
    }
}

@Composable
fun TrianguloInferiorNepal(modifier: Modifier = Modifier) {
    val azulBorde = colorResource(id = R.color.Azul)
    val rojoCarmesi = colorResource(id = R.color.Rojo)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val grosorBorde = w * 0.04f

        val pathInferior = Path().apply {
            moveTo(0f, 0f)
            lineTo(w * 0.95f, h * 0.85f)
            lineTo(0f, h)
            close()
        }

        drawPath(path = pathInferior, color = rojoCarmesi)


        drawPath(
            path = pathInferior,
            color = azulBorde,
            style = Stroke(
                width = grosorBorde,
                join = StrokeJoin.Round
            )
        )
    }
}

@Composable
fun LogoLunaNepal(modifier: Modifier = Modifier) {
    val rojoCarmesi = colorResource(id = R.color.Rojo)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val radio = w * 0.12f

        val centro = Offset(w * 0.28f, h * 0.55f)


        drawCircle(color = Color.White, radius = radio, center = centro)


        drawCircle(
            color = rojoCarmesi,
            radius = radio * 0.85f,
            center = Offset(centro.x, centro.y - radio * 0.30f)
        )


        dibujarPoligonoEstrellado(
            centro = Offset(centro.x, centro.y + radio * 0.15f),
            radioExterno = radio * 0.45f,
            numPuntas = 8,
            color = Color.White
        )
    }
}

@Composable
fun LogoSolNepal(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val radio = w * 0.15f

        val centro = Offset(w * 0.28f, h * 0.55f)

        dibujarPoligonoEstrellado(
            centro = centro,
            radioExterno = radio,
            numPuntas = 12,
            color = Color.White
        )
    }
}


fun DrawScope.dibujarPoligonoEstrellado(centro: Offset, radioExterno: Float, numPuntas: Int, color: Color) {
    val path = Path()
    val radioInterno = radioExterno * 0.5f

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
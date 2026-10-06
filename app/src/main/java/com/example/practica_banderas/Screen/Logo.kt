package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun LogoKiribati(modifier: Modifier = Modifier) {
    val amarilloKiribati = Color(0xFFFFCE00)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height


        val centroSol = Offset(w / 2f, h)
        val radioSol = h * 0.35f


        drawArc(
            color = amarilloKiribati,
            startAngle = 180f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset(centroSol.x - radioSol, centroSol.y - radioSol),
            size = Size(radioSol * 2, radioSol * 2)
        )


        val numRayos = 17
        val longitudRayo = radioSol * 1.6f
        val anchoRayoAngulo = 4.0

        for (i in 0 until numRayos) {

            val anguloBase = 180.0 + (i * (180.0 / (numRayos - 1)))

            val anguloCentroRad = Math.toRadians(anguloBase)
            val anguloIzqRad = Math.toRadians(anguloBase - anchoRayoAngulo)
            val anguloDerRad = Math.toRadians(anguloBase + anchoRayoAngulo)

            val puntaX = centroSol.x + longitudRayo * cos(anguloCentroRad).toFloat()
            val puntaY = centroSol.y + longitudRayo * sin(anguloCentroRad).toFloat()

            val baseIzqX = centroSol.x + radioSol * cos(anguloIzqRad).toFloat()
            val baseIzqY = centroSol.y + radioSol * sin(anguloIzqRad).toFloat()

            val baseDerX = centroSol.x + radioSol * cos(anguloDerRad).toFloat()
            val baseDerY = centroSol.y + radioSol * sin(anguloDerRad).toFloat()

            val rayoPath = Path().apply {
                moveTo(baseIzqX, baseIzqY)
                lineTo(puntaX, puntaY)
                lineTo(baseDerX, baseDerY)
                close()
            }
            drawPath(path = rayoPath, color = amarilloKiribati)
        }

        val avePath = Path().apply {
            val centroAveX = w / 2f
            val centroAveY = h * 0.25f
            val envergadura = w * 0.35f

            moveTo(centroAveX, centroAveY)

            quadraticBezierTo(
                centroAveX - envergadura * 0.5f, centroAveY - h * 0.15f,
                centroAveX - envergadura, centroAveY + h * 0.05f
            )
            quadraticBezierTo(
                centroAveX - envergadura * 0.3f, centroAveY - h * 0.02f,
                centroAveX, centroAveY + h * 0.08f
            )

            quadraticBezierTo(
                centroAveX + envergadura * 0.3f, centroAveY - h * 0.02f,
                centroAveX + envergadura, centroAveY + h * 0.05f
            )
            quadraticBezierTo(
                centroAveX + envergadura * 0.5f, centroAveY - h * 0.15f,
                centroAveX, centroAveY
            )
            close()
        }
        drawPath(path = avePath, color = amarilloKiribati)
    }
}
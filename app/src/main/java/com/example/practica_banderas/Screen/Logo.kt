package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun LogoCuba(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val h = size.height
        val largoTriangulo = h * 0.866f

        // Triángulo rojo
        val triangulo = Path().apply {
            moveTo(0f, 0f)
            lineTo(largoTriangulo, h / 2f)
            lineTo(0f, h)
            close()
        }
        drawPath(triangulo, color = Color(0xFFCF142B))

        // Estrella blanca de 5 puntas
        val centro = Offset(largoTriangulo / 3f, h / 2f)
        val radioExterno = h * 0.17f
        val radioInterno = radioExterno * 0.382f

        val estrella = Path().apply {
            for (i in 0 until 10) {
                val radio = if (i % 2 == 0) radioExterno else radioInterno
                val angulo = -PI / 2 + i * PI / 5   // empieza apuntando hacia arriba
                val x = centro.x + (radio * cos(angulo)).toFloat()
                val y = centro.y + (radio * sin(angulo)).toFloat()
                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }
        drawPath(estrella, color = Color.White)
    }
}
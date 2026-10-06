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
        val w = size.width
        val h = size.height
        val largoTriangulo = w // El largo se adapta al ancho asignado en el layout

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
        val radioExterno = minOf(w, h) * 0.15f
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
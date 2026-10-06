package com.example.practica_banderas.Screen


import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.colorResource
import com.example.practica_banderas.R
import kotlin.math.PI
import kotlin.math.atan
import kotlin.math.tan

private fun DrawScope.puntoEnBorde(grados: Float): Offset {
    val w = size.width
    val h = size.height
    if (grados >= 90f) return Offset(0f, 0f)
    if (grados <= 0f) return Offset(w, h)
    val t = tan(Math.toRadians(grados.toDouble())).toFloat()
    val xArriba = h / t
    return if (xArriba <= w) Offset(xArriba, 0f) else Offset(w, h - w * t)
}

@Composable
fun AbanicoSeychelles(modifier: Modifier = Modifier) {
    val colores = listOf(
        colorResource(R.color.Azul),
        colorResource(R.color.Amarillo),
        colorResource(R.color.Rojo),
        Color.White,
        colorResource(R.color.Verde)
    )
    Canvas(modifier) {
        val origen = Offset(0f, size.height)
        val angulos = listOf(90f, 72f, 54f, 36f, 18f, 0f)
        val anguloEsquina = atan(size.height / size.width) * 180f / PI.toFloat()

        for (i in colores.indices) {
            val a = angulos[i]
            val b = angulos[i + 1]
            val path = Path().apply {
                moveTo(origen.x, origen.y)
                val pa = puntoEnBorde(a)
                lineTo(pa.x, pa.y)
                if (a > anguloEsquina && b < anguloEsquina) lineTo(size.width, 0f)
                val pb = puntoEnBorde(b)
                lineTo(pb.x, pb.y)
                close()
            }
            drawPath(path, colores[i])
        }
    }
}
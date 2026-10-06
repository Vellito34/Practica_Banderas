package com.example.practica_banderas.Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


private val TrianguloInferiorIzquierdo = GenericShape { size, _ ->
    moveTo(0f, 0f)
    lineTo(0f, size.height)
    lineTo(size.width, size.height)
    close()
}

@Composable
fun TrianguloNegro(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(Color.Black, TrianguloInferiorIzquierdo))
}

@Composable
fun Estrella(tamano: Dp, color: Color = Color.White, puntas: Int = 5) {
    Canvas(Modifier.size(tamano)) {
        val cx = size.width / 2f
        val cy = size.height / 2f
        val radioExterior = size.minDimension / 2f
        val radioInterior = radioExterior * 0.4f

        val path = Path()
        for (i in 0 until puntas * 2) {
            // Alterna entre punta (radio exterior) y hueco (radio interior)
            val r = if (i % 2 == 0) radioExterior else radioInterior
            // -PI/2 hace que la primera punta apunte hacia arriba
            val angulo = -PI / 2 + i * PI / puntas
            val x = cx + (r * cos(angulo)).toFloat()
            val y = cy + (r * sin(angulo)).toFloat()
            if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
        }
        path.close()
        drawPath(path, color)
    }
}

@Composable
fun CruzDelSur(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Estrella(18.dp)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Estrella(50.dp)
            Spacer(Modifier.width(30.dp))
            Estrella(40.dp)
            Spacer(Modifier.width(30.dp))
            Estrella(18.dp)
        }
        Estrella(30.dp)
    }
}
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import kotlin.math.cos
import kotlin.math.sin

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Composable
fun LogoIsrael(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val azul = Color(0xFF0038B8)

        // Fondo blanco
        drawRect(color = Color.White)

        // Estrella de David: dos triángulos superpuestos
        val cx = size.width / 2f
        val cy = size.height / 2f
        val r = size.height * 0.20f
        val grosor = size.height * 0.04f

        drawPath(
            path = trianglePath(cx, cy, r, -90f),
            color = azul,
            style = Stroke(width = grosor)
        )
        drawPath(
            path = trianglePath(cx, cy, r, 90f),
            color = azul,
            style = Stroke(width = grosor)
        )
    }
}
package com.example.practica_banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_banderas.ui.theme.Practica_BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_BanderasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaEspana(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            redFlag(modifier = Modifier.fillMaxSize())
        }
        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color(0xFFF1BF00)),
            Alignment.TopStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.spain),
                contentDescription = "Bandera Española",
                modifier = Modifier
                    .size(200.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            redFlag(modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
fun redFlag(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Red)
    )
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    Practica_BanderasTheme {

    }
}
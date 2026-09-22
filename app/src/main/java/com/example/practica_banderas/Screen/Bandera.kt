package com.example.practica_banderas.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_banderas.R

@Composable
fun BanderaEEUU(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier.fillMaxSize()) {
            repeat(13) { index ->
                Box(
                    modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(
                            if (index % 2 == 0)
                                Color(0xFFB22234)
                            else
                                Color.White
                        )
                )
            }
        }
        Box(
            modifier = modifier
                .align(Alignment.TopStart)
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.54f)
                .background(Color(0xFF3C3B6E))
        )

        Column(
            modifier = modifier
                .fillMaxSize(0.4f)
                .fillMaxHeight(0.54f),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            repeat(9) { index ->

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    repeat(6) { index ->
                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = "",
                            modifier = modifier.size(14.dp)
                        )
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun BanderaEEUUPreview() {
    BanderaEEUU()
}
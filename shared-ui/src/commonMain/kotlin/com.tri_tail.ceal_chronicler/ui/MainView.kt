package com.tri_tail.ceal_chronicler.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.tri_tail.ceal_chronicler.theme.AppTheme
import com.tri_tail.ceal_chronicler.theme.*
import com.tri_tail.ceal_chronicler.R

@Composable
fun MainView() {
    AppTheme {
        Column() {
            Image(
                painter = painterResource(
                    id= R.drawable.CealChroniclerLogo
                ),
                contentDescription = "Ceal Chronicler Logo"
            )
            Card(
                elevation = 10.dp,
                modifier = Modifier.wrapContentSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    primaryColor,
                                    primaryDarkColor,
                                )
                            )
                        )
                        .padding(15.dp)
                ) {
                    Text(
                        text = "Welcome to the Ceal Chronicler!",
                        style = typography.h1
                    )
                }
            }
        }
    }
}
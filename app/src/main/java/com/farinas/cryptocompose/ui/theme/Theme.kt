package com.farinas.cryptocompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = ColorPrimary,
    background = DarkGray,
    onBackground = TextWhite,
    onPrimary = DarkGray
)

private val LightColorPalette = lightColors(
    primary = ColorPrimary,
    background = Color.White,
    onBackground = MediumGray,
    onPrimary = DarkGray
)

@Composable
fun CryptoComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
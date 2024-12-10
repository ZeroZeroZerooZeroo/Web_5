package com.example.airplaneapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = GreenPrimary,
    onPrimary = Color.White,
    secondary = GreenSecondary,
    error = RedError,
    background = Color(0xFFF5F5F5),
    onBackground = Color.Black
)

@Composable
fun AirplaneAppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // Можно добавить поддержку темной темы, изменив LightColorScheme на DarkColorScheme при необходимости
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = AirplaneTypography,
        content = content
    )
}
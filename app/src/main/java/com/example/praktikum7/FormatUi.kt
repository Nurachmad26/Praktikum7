package com.example.praktikum7

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier) {
    Text(
        text = StringResource(R.string.subtotal_price, subtotal),
        modifier = modifier
        style = NaterialTheme.typography.headlineSmall
    )
}
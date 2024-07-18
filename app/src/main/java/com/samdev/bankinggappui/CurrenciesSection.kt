package com.samdev.bankinggappui

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro

val currencies = listOf(
    Currency(
        name = "USD",
        buy = 23.35f,
        sell = 23.33f,
        icon =  Icons.Rounded.AttachMoney
    ),

    Currency(
        name = "EUR",
        buy = 13.35f,
        sell = 13.25f,
        icon =  Icons.Rounded.Euro
    ),

    Currency(
        name = "YEN",
        buy = 16.67f,
        sell = 17.35f,
        icon =  Icons.Rounded.CurrencyYen
    ),
)
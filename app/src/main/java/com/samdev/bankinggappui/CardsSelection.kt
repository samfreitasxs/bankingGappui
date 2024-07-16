package com.samdev.bankinggappui

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.samdev.bankinggappui.data.Card
import com.samdev.bankinggappui.ui.theme.BlueEnd
import com.samdev.bankinggappui.ui.theme.BlueStart
import com.samdev.bankinggappui.ui.theme.GreenEnd
import com.samdev.bankinggappui.ui.theme.GreenStart
import com.samdev.bankinggappui.ui.theme.OrangeEnd
import com.samdev.bankinggappui.ui.theme.OrangeStart
import com.samdev.bankinggappui.ui.theme.PurpleEnd
import com.samdev.bankinggappui.ui.theme.PurpleStart

val cards = listOf(

    Card(
        cardType = "VISA",
        cardNumber = "3664 7567 8484 3976",
        cardName = "Business",
        balance = 6.467,
        color = getGradient(BlueStart, BlueEnd),
    ),

    Card(
        cardType = "MASTER CARD",
        cardNumber = "2344 7583 7899 2223",
        cardName = "savings",
        balance = 46.467,
        color = getGradient(PurpleStart, PurpleEnd),
    ),

    Card(
        cardType = "VISA",
        cardNumber = "0078 3455 3555 7899",
        cardName = "School",
        balance = 3.467,
        color = getGradient(OrangeStart, OrangeEnd),
    ),

    Card(
        cardType = "MASTER CARD",
        cardNumber = "3567 7865 3786 3955",
        cardName = "Trips",
        balance = 26.47,
        color = getGradient(GreenStart, GreenEnd),
    ),

)


fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

@Composable
fun CardsSection () {
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}


@Composable
fun CardItem(
    index: Int
) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
}
package com.samdev.bankinggappui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samdev.bankinggappui.data.Finance
import com.samdev.bankinggappui.ui.theme.BlueStart
import com.samdev.bankinggappui.ui.theme.GreenStart
import com.samdev.bankinggappui.ui.theme.OrangeStart
import com.samdev.bankinggappui.ui.theme.PurpleStart

val finance = listOf(
    Finance(
        icon = Icons.Rounded.StarHalf,
        name = "My\nBusiness",
        background = OrangeStart
    ),

    Finance(
        icon = Icons.Rounded.Wallet,
        name = "My\nWallet",
        background = BlueStart
    ),

    Finance(
        icon = Icons.Rounded.StarHalf,
        name = "Finance\nAnalytics",
        background = PurpleStart
    ),

    Finance(
        icon = Icons.Rounded.MonetizationOn,
        name = "My\nTransactions",
        background = GreenStart
    ),
)
@Preview
@Composable
fun FinanceSection() {
    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
    }
}
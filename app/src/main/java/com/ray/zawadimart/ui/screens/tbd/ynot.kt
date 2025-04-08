package com.ray.zawadimart.ui.screens.tbd

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutScreen(navController: NavController){
    Text(
        text = "ZawadiMart",
        fontSize = 30.sp,
        color = Color.Blue,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        textDecoration = TextDecoration.Underline
    )

}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){

    AboutScreen(rememberNavController())
}
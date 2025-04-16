package com.ray.zawadimart.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ray.zawadimart.R
import com.ray.zawadimart.navigation.ROUT_DASHBOARD
import com.ray.zawadimart.navigation.ROUT_FORM
import com.ray.zawadimart.navigation.ROUT_LOGIN
import com.ray.zawadimart.navigation.ROUT_START
import com.ray.zawadimart.navigation.ROUT_TRIAL
import com.ray.zawadimart.ui.theme.newOrange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    //Navigation

    var coroutine = rememberCoroutineScope()

    coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)
    }


    //End of Navigation

    Column (
        modifier = Modifier.fillMaxSize().background(newOrange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )

        Text(text = "ZawadiMart", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)

    }

}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())
}
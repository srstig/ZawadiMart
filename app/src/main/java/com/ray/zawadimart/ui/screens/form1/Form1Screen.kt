package com.ray.zawadimart.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ray.zawadimart.R
import com.ray.zawadimart.ui.theme.newOrange
import com.ray.zawadimart.ui.theme.newWhite


@Composable
fun Form1Screen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){


      Box () {
          Card(
              modifier = Modifier.fillMaxWidth().height(400.dp),
              shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 10.dp, topEnd = 10.dp),
              colors = CardDefaults.cardColors(newOrange)

          ) {
              Row(modifier = Modifier.fillMaxWidth().padding(18.dp), horizontalArrangement = Arrangement.Center) {

                  Image(
                      painter = painterResource(R.drawable.product),
                      contentDescription = "",
                      modifier = Modifier.size(50.dp)

                  )

                  Text(text = "Logo App", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight.Bold,)

              }
          }
      }








    }

}


@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){

   Form1Screen(rememberNavController())
}
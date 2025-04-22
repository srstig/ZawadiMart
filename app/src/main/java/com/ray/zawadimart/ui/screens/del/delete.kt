package com.ray.zawadimart.ui.screens.del


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ray.zawadimart.R
import com.ray.zawadimart.ui.theme.newBlue
import com.ray.zawadimart.ui.theme.newOrange
import com.ray.zawadimart.ui.theme.newWhite


@Composable
fun Form1Screen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }




        Box () {
            Card(
                modifier = Modifier.fillMaxWidth().height(400.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 10.dp, topEnd = 10.dp),
                colors = CardDefaults.cardColors(newBlue)

            ) {
                Row(modifier = Modifier.fillMaxWidth().padding(18.dp), horizontalArrangement = Arrangement.Center) {

                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "",
                        modifier = Modifier.size(50.dp)

                    )

                    Text(text = "Logo App", fontSize = 22.sp, color = Color.White)

                }
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "",
                        modifier = Modifier.size(180.dp),
                    )
                }



            }
        }

        Spacer(modifier = Modifier.height(10.dp))



        Box (){
            //Card
            Card(
                modifier = Modifier.fillMaxWidth().height(400.dp),
                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 10.dp, topEnd = 10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ) {

                Column (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "The Most Worthy Grocery App", Modifier.padding(start = 13.dp, top = 10.dp, end = 13.dp),fontWeight = FontWeight.Bold, color = newOrange, fontSize = 28.sp)

                }
                Spacer(modifier = Modifier.height(10.dp))

//Username
                OutlinedTextField(
                    value = username,
                    onValueChange = {username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    label = { Text(text = "Username")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                //End
                Spacer(modifier = Modifier.height(10.dp))

                //Password
                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    label = { Text(text = "Password")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )
                //End
                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(newOrange),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

                ) {
                    Text(text = "Sign Up")

                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                    Text(text = "Already are members?", fontSize = 18.sp)

                    Text(text = "Login", color = newOrange, fontSize = 18.sp)
                }

            }
        }





    }
    //End of Card





}







@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){

    Form1Screen(rememberNavController())
}
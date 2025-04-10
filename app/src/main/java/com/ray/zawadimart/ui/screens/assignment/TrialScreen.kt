package com.ray.zawadimart.ui.screens.assignment

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ray.zawadimart.R
import com.ray.zawadimart.navigation.ROUT_HOME
import com.ray.zawadimart.ui.theme.newGreen
import com.ray.zawadimart.ui.theme.newOrange
import com.ray.zawadimart.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrialScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "") },
                    label = {  },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Build, contentDescription = "") },
                    label = {  },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = {  },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )


            }
        },

        //FloatingActionButton
        floatingActionButton = {

        },

        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .paint(painter = painterResource(R.drawable.img_2), contentScale = ContentScale.FillBounds)

            ) {
                val mContext = LocalContext.current

                //Main Contents of the page


                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Hi Samantha",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),

                )

                Text(text = "Here are your projects",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 20.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row (modifier = Modifier
                    .padding(start = 20.dp)
                    .horizontalScroll(rememberScrollState())
                ){

                    //Card 1
                    Card (
                        modifier = Modifier
                            .width(190.dp)
                            .height(350.dp)
                            .clickable {navController.navigate(ROUT_HOME)},
                        colors = CardDefaults.cardColors(Color.Blue)
                    )
                    {
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.home),
                                contentDescription = "",
                                modifier = Modifier.width(200.dp).height(80.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Column() {  }

                            Text(text = "Cryptocurrency ", fontSize = 25.sp, color = Color.White,fontFamily = FontFamily.SansSerif)
                            Text(text = "Landing Page",fontSize = 25.sp, color = Color.White, fontFamily = FontFamily.SansSerif)

                        }

                    }

                    //End of Card 1

                    Spacer(modifier = Modifier.width(20.dp))


                    //Card 2
                    Card (
                        modifier = Modifier
                            .width(190.dp)
                            .height(350.dp)
                            .clickable {navController.navigate(ROUT_HOME)},
                        colors = CardDefaults.cardColors(newOrange)
                    )
                    {
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.home),
                                contentDescription = "",
                                modifier = Modifier.width(200.dp).height(80.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Column() {  }

                            Text(text = "Cryptocurrency ", fontSize = 25.sp, color = Color.White,fontFamily = FontFamily.SansSerif)
                            Text(text = "Landing Page",fontSize = 25.sp, color = Color.White, fontFamily = FontFamily.SansSerif)

                        }

                    }

                    //End of Card 2

                    Spacer(modifier = Modifier.width(20.dp))


                    //Card 3
                    Card (
                        modifier = Modifier
                            .width(190.dp)
                            .height(350.dp)
                            .clickable {navController.navigate(ROUT_HOME)},
                        colors = CardDefaults.cardColors(newGreen)
                    )
                    {
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.home),
                                contentDescription = "",
                                modifier = Modifier.width(200.dp).height(80.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Column() {  }

                            Text(text = "Cryptocurrency ", fontSize = 25.sp, color = Color.White,fontFamily = FontFamily.SansSerif)
                            Text(text = "Landing Page",fontSize = 25.sp, color = Color.White, fontFamily = FontFamily.SansSerif)

                        }

                    }

                    //End of Card 3






                }

                //End of Row
                Spacer(modifier = Modifier.height(20.dp))




            }
        }
    )

    //End of scaffold

}


@Preview(showBackground = true)
@Composable
fun TrialScreenPreview(){

    TrialScreen(rememberNavController())
}
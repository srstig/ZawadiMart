package com.ray.zawadimart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ray.zawadimart.data.UserDatabase
import com.ray.zawadimart.repository.UserRepository
import com.ray.zawadimart.ui.screens.about.AboutScreen
import com.ray.zawadimart.ui.screens.assignment.TrialScreen
import com.ray.zawadimart.ui.screens.auth.LoginScreen
import com.ray.zawadimart.ui.screens.auth.RegisterScreen
import com.ray.zawadimart.ui.screens.dashboard.DashboardScreen
import com.ray.zawadimart.ui.screens.form.FormScreen
import com.ray.zawadimart.ui.screens.form1.Form1Screen
import com.ray.zawadimart.ui.screens.home.HomeScreen
import com.ray.zawadimart.ui.screens.intent.IntentScreen
import com.ray.zawadimart.ui.screens.item.ItemScreen
import com.ray.zawadimart.ui.screens.service.ServiceScreen
import com.ray.zawadimart.ui.screens.splash.SplashScreen
import com.ray.zawadimart.ui.screens.start.StartScreen
import com.ray.zawadimart.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_TRIAL) {
            TrialScreen(navController)
        }
        composable(ROUT_FORM) {
           FormScreen(navController)
        }
        composable(ROUT_FORM1) {
            Form1Screen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }





    }
}
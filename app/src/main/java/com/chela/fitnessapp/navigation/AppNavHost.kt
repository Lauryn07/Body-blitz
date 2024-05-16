package com.chela.fitnessapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.chela.fitnessapp.ui.theme.screens.home.HomeScreen
import com.chela.fitnessapp.ui.theme.screens.login.LoginScreen
import com.chela.fitnessapp.ui.theme.screens.nutrition.DietScreen
import com.chela.fitnessapp.ui.theme.screens.reg.RegistrationScreen
import com.chela.fitnessapp.ui.theme.screens.splash.SplashScreen
import com.chela.fitnessapp.ui.theme.screens.workout.WorkoutScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController = navController, startDestination =startDestination,
        modifier = modifier){


        composable(ROUTE_HOME){
            HomeScreen(navController)

        }


        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
      composable(ROUTE_REGISTRATION) {
          RegistrationScreen(navController)
      }
        composable(ROUTE_WORKOUT){
            WorkoutScreen(navController)
        }

        composable(ROUTE_NUTRITION){
            DietScreen(navController )
        }
    }


    }




package com.chela.fitnessapp.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chela.fitnessapp.R

import com.chela.fitnessapp.navigation.ROUTE_NUTRITION
import com.chela.fitnessapp.navigation.ROUTE_WORKOUT


@Composable
fun HomeScreen(navController: NavHostController)
{



    Box(modifier = Modifier.fillMaxSize())
    {
//        Background image
    }

    Image(painter = painterResource(id = R.drawable.bb),
        contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds)

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Welcome to Body Blitz",
            fontSize = 44.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.padding(299.dp))
        Button   (
            onClick = {

                navController.navigate(ROUTE_WORKOUT)

            }, Modifier
                .width(299.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ) {
            Text(
                text = "Workout",
                textAlign = TextAlign.Center,
                fontSize = 20.sp
                , color = Color.Black
            )


        }



        Spacer(modifier = Modifier.padding(9.dp))
        Button(
            onClick = {
                navController.navigate(ROUTE_NUTRITION)


            }, Modifier
                .width(299.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ) {
            Text(
                text = "Diet",
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                 color = Color.Black
            )

        }
    }



}

@Preview
@Composable
private fun HomeScreenpre() {
    HomeScreen(navController = rememberNavController())

}

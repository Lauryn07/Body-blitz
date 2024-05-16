package com.chela.fitnessapp.ui.theme.screens.nutrition

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chela.fitnessapp.R

@Composable
fun DietScreen(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize())
    {
//        Background image
    }

    Image(painter = painterResource(id = R.drawable.nut),
        contentDescription =null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds)

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()){

        Spacer(modifier = Modifier.padding(9.dp))
        Text(text = "WEIGHT LOSS",
            fontSize = 44.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.Black,


        )
        Spacer(modifier = Modifier.padding(9.dp))

        Text(text = "Healthy foods that support weight loss are highly packed with fibre " +
                "and incredibly filling such as cruciferous vegetables like broccoli and cabbage "   ,
            fontSize = 24.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .background(color = Color.Black)
                .clip(shape = RoundedCornerShape(20.dp))


        )

        Spacer(modifier = Modifier.padding(9.dp))
        Text(text = "ADDING BULK",
            fontSize = 44.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.Black,


            )
        Spacer(modifier = Modifier.padding(9.dp))

        Text(text = "Experts recommend consuming 10–20% more calories during bulking than your body needs. " +
                "Carbs should comprise the largest percentage of your diet, followed by protein and fat."   ,
            fontSize = 24.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .background(color = Color.Black)
                .clip(shape = RoundedCornerShape(20.dp))


        )

        Spacer(modifier = Modifier.padding(9.dp))
        Text(text = "GUT HEALTH",
            fontSize = 44.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.Black,


            )

        Spacer(modifier = Modifier.padding(9.dp))

        Text(text ="eating lots of fruits, vegetables, nuts, seeds and whole grains" +
                " for prebiotics (food for the bacteria) and fermented foods .",
            fontSize = 24.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .background(color = Color.Black)
                .clip(shape = RoundedCornerShape(20.dp))


        )





    }










}


@Preview
@Composable
private fun Dietpre() {
    DietScreen(navController = rememberNavController())

}
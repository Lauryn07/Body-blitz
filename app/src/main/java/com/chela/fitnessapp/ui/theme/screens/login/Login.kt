package com.chela.fitnessapp.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chela.fitnessapp.R
import com.chela.fitnessapp.navigation.ROUTE_HOME
import com.chela.fitnessapp.navigation.ROUTE_REGISTRATION

@Composable
fun LoginScreen(navController: NavHostController) {
   Box(modifier = Modifier.fillMaxSize()){

       var email by remember { mutableStateOf(TextFieldValue("")) }

       var password by remember { mutableStateOf(TextFieldValue("") )}



       Column (verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally,
           modifier = Modifier
               .fillMaxSize()
               .clip(RoundedCornerShape(9.dp))
               .background

                   (Color.White)){
           Text(text = "BODY BLITZ", fontFamily = FontFamily.Cursive,
               fontSize = 46.sp)

           Spacer(modifier = Modifier.height(9.dp))

           Image(painter = painterResource(id = R.drawable.bb), contentDescription = "logo",
               modifier = Modifier
                   .clip(RoundedCornerShape(9.dp))
                   .padding(6.dp)
                   .size(78.dp))


           OutlinedTextField(value = email,
               onValueChange = { email = it },
               trailingIcon = {
                   Icon(
                       imageVector = Icons.Default.Email,
                       contentDescription = null
                   )

               },
               label = { Text(text = "Enter your email") })

           Spacer(modifier = Modifier.padding(9.dp))

           OutlinedTextField(value = password,
               onValueChange = {},
               trailingIcon = {
                   Icon(
                       imageVector = Icons.Default.Lock,
                       contentDescription = null

                   )
               },
               label = { Text(text = "Enter password") })

           Spacer(modifier = Modifier.padding(9.dp))
           Button   (
               onClick = {

                  navController.navigate(ROUTE_HOME)

               }, Modifier
                   .width(299.dp),
               colors = ButtonDefaults.buttonColors(Color.DarkGray)
           ) {
               Text(
                   text = "Login",
                   textAlign = TextAlign.Center,
                   fontSize = 20.sp,
                   color = Color.Black
               )


           }
           Spacer(modifier = Modifier.padding(9.dp))

           Text(text = "You don't have an account?")


           Spacer(modifier = Modifier.padding(9.dp))
           Button(
               onClick = {
                   navController.navigate(ROUTE_REGISTRATION)


               }, Modifier
                   .width(299.dp),
               colors = ButtonDefaults.buttonColors(Color.DarkGray)
           ) {
               Text(
                   text = "Register here",
                   textAlign = TextAlign.Center
                   ,
                   fontSize = 20.sp
                   , color = Color.Black
               )


           }


       }

   }


}







@Preview
@Composable
private fun Loginpre() {
    LoginScreen(navController = rememberNavController())

}
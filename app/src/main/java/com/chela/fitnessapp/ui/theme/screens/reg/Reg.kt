package com.chela.fitnessapp.ui.theme.screens.reg

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
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

@Composable
fun RegistrationScreen(navController: NavHostController) {
    var name by remember { mutableStateOf(TextFieldValue (""))
    }
    var number by remember { mutableStateOf(TextFieldValue(""))
    }
    var email by remember { mutableStateOf(TextFieldValue("")) }

    var password by remember { mutableStateOf(TextFieldValue("") ) }




    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        , modifier = Modifier
            .fillMaxSize()
            .background(Color.White)){

        Text(text = "Create an account", fontSize = 46.sp,
            fontFamily = FontFamily.Cursive)


        OutlinedTextField(value = name,
            onValueChange = { name = it },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )

            },
            label = { Text(text = "Enter name") })

        Spacer(modifier = Modifier.padding(9.dp))
        OutlinedTextField(value = number,
            onValueChange = { number= it },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null
                )

            },
            label = { Text(text = "Enter number") })
        Spacer(modifier = Modifier.padding(9.dp))

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
        Button(
            onClick = {



            }, Modifier
                .width(299.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ) {
            Text(
                text = "Register account",
                textAlign = TextAlign.Center,
                fontSize = 20.sp
                , color = Color.Black
            )


        }
        Spacer(modifier = Modifier.height(9.dp))

        Image(painter = painterResource(id = R.drawable.bb), contentDescription = "logo",
            modifier = Modifier
                .clip(RoundedCornerShape(9.dp))
                .padding(6.dp)
                .size(89.dp))




    }

}



@Preview
@Composable
private fun Regpre() {

    RegistrationScreen(navController = rememberNavController())

}
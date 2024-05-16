package com.chela.fitnessapp.ui.theme.screens.workout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chela.fitnessapp.ui.theme.FitnessAppTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")


                }
            }
        }
    }
}


data class Item(val title: String, val description: String)

// Sample list of items
val items = listOf(
    Item("Day 1", "Leg day:" +
            "squats," +
            "" +
            "lunges"),
    Item("Day 2", "Arms day:" +
            "tricep dips," +
            "" +
            "overhead press"),

    Item("Day 3", "Abs day:" +
            "crunches" +
            "" +
            "sit ups" +
            "" +
            "Russian twist"),
    Item("Day 4", "Leg day:" +
            "leg raises" +
            "" +
            "wall sits"),
    Item("Day 5", "Full Body"),
    // Add more items as needed
)





@Composable
fun WorkoutScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items) { item ->
            CardItem(item)
        }
    }

}
@Composable
fun CardItem(item: Item) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        color = Color.DarkGray

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

//            Image(painter = painterResource(id = R.drawable.gym2),
//                contentDescription =null,
//                modifier = Modifier.fillMaxSize(),
//                contentScale = ContentScale.FillBounds)


            Column {
                Text(text = item.title, style = MaterialTheme.typography.headlineSmall)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = item.description, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}





@Preview
@Composable
private fun Workoutpre() {
    MaterialTheme{

        WorkoutScreen(navController = rememberNavController())
    }



}
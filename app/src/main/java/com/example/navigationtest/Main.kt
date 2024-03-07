package com.example.navigationtest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun Main(navController: NavController){
    Column {
        Text(
            text = "Main",
            modifier = Modifier,
        )
        Button(onClick = {
            navController.navigate("Main")
        }) {
            Text(text = "ToMain")
        }
        Button(onClick = {
            navController.navigate("Recipe")
        }) {
            Text(text = "ToRecipe")
        }
        Button(onClick = {
            navController.navigate("Profile")
        }) {
            Text(text = "ToProfile")
        }
        Button(onClick = {
            navController.navigate("Collection")
        }) {
            Text(text = "ToCollection")
        }
        Button(onClick = {
            navController.navigate("Search")
        }) {
            Text(text = "ToSearch")
        }
        Button(onClick = {
            navController.navigate("Collection")
        }) {
            Text(text = "ToCollection")
        }
    }
}
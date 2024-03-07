package com.example.navigationtest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationtest.ui.theme.NavigationTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val navigateItems = listOf("Profile", "Main", "Recipe", "Registration", "Search")
                    Log.d("type", navController::class.toString())
                    NavHost(navController = navController, startDestination = "Main"){
                        composable("Main"){
                            Main(navController)
                        }
                        composable("Profile"){
                            Profile(navController)
                        }
                        composable("Recipe"){
                            Recipe(navController)
                        }
                        composable("Registration"){
                            Registration(navController)
                        }
                        composable("Search"){
                            Search(navController)
                        }
                        composable("Collection"){
                            Collection(navController)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationTestTheme {
        Greeting("Android")
    }
}
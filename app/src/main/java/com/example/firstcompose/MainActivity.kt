package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            userInput()
        }
    }
}

@Composable
fun userInput() {
    val state = remember{mutableStateOf("")}
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = {
            Text(text = "Enter Message")
        }
    )
}

/*
@Composable
fun SayHello(name: String = "Not Set") {
    Text(text = name)
}

@Preview(name = "first", showBackground = true, showSystemUi = true)
@Composable
fun PreviewFunction() {
    SayHello("pass by value")
}

*/
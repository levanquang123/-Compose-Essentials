package com.example.mycomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ComposeEssentialsScreen() {
    Column {
        Text("Welcome to Compose Essentials!")
        Button(onClick = { /* Handle Action */ }) {
            Text("Click Me")
        }
    }
}

@Preview
@Composable
fun PreviewComposeEssentialsScreen() {
    ComposeEssentialsScreen()
}

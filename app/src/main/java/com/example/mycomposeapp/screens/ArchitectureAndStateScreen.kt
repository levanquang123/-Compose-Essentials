package com.example.mycomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ArchitectureAndStateScreen() {
    Column {
        Text("Architecture and State in Compose")
        Button(onClick = { /* Handle Action */ }) {
            Text("State Change")
        }
    }
}

@Preview
@Composable
fun PreviewArchitectureAndStateScreen() {
    ArchitectureAndStateScreen()
}

package com.example.mycomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LayoutsThemingAnimationScreen() {
    Column {
        Text("Layouts, Theming & Animation!")
        Button(onClick = { /* Handle Action */ }) {
            Text("Animate")
        }
    }
}

@Preview
@Composable
fun PreviewLayoutsThemingAnimationScreen() {
    LayoutsThemingAnimationScreen()
}

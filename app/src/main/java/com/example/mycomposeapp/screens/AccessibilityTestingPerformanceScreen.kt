package com.example.mycomposeapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AccessibilityTestingPerformanceScreen() {
    Column {
        Text("Accessibility, Testing & Performance")
        Button(onClick = { /* Handle Action */ }) {
            Text("Test")
        }
    }
}

@Preview
@Composable
fun PreviewAccessibilityTestingPerformanceScreen() {
    AccessibilityTestingPerformanceScreen()
}

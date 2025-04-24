package com.example.mycomposelabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycomposeapp.screens.ComposeEssentialsScreen
import com.example.mycomposeapp.screens.LayoutsThemingAnimationScreen
import com.example.mycomposeapp.screens.ArchitectureAndStateScreen
import com.example.mycomposeapp.screens.AccessibilityTestingPerformanceScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Button(onClick = { ComposeEssentialsScreen() }) {
                    Text("Compose Essentials")
                }
                Button(onClick = { LayoutsThemingAnimationScreen() }) {
                    Text("Layouts & Theming & Animation")
                }
                Button(onClick = { ArchitectureAndStateScreen() }) {
                    Text("Architecture and State")
                }
                Button(onClick = { AccessibilityTestingPerformanceScreen() }) {
                    Text("Accessibility Testing & Performance")
                }
            }
        }
    }
}

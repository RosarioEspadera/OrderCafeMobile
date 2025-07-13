package com.example.ordercafemobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ordercafemobile.ui.theme.OrderCafeMobileTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OrderCafeMobileTheme {
               Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Column(modifier = Modifier
        .padding(innerPadding)
        .padding(24.dp)
        .fillMaxSize()) {
        
        Text(
            text = "Welcome to OrderCafe!",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(onClick = { /* Navigate to Menu */ }, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)) {
            Text("View Menu")
        }

        Button(onClick = { /* Navigate to Order History */ }, modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)) {
            Text("Order History")
        }

        Button(onClick = { /* Navigate to Profile */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Your Profile")
        }
    }
}

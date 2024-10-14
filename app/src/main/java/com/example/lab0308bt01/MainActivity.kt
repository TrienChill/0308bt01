package com.example.lab0308bt01

import android.annotation.SuppressLint
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
import com.example.lab0308bt01.ui.theme.Lab0308bt01Theme

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.lab0308bt01.ui.theme.Lab0308bt01Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Sử dụng Jetpack Compose để xây dựng UI
        setContent {
            MyAppTheme { // Áp dụng Dark Mode và Material Design
                MyApp()
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp() {
    // Giao diện Material Design với Scaffold
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Jetpack Compose Demo") }
            )
        }
    )
    {
        // Nội dung chính của giao diện
        MainContent()
    }
}
@Composable
fun MainContent() {
    // Biến trạng thái để theo dõi số lần nhấn nút
    var count by remember { mutableStateOf(0) }
    // Giao diện chính với Column
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "You clicked the button $count times",
            style = MaterialTheme.typography.h5
        )
        Spacer(modifier = Modifier.height(16.dp)) // Khoảng cách giữa các thành phần
        // Nút nhấn sử dụng Button của Material Design
        Button(
            onClick = { count++ },
            colors = ButtonDefaults.buttonColors(backgroundColor =
            MaterialTheme.colors.primary)
        ) {
            Text("Click Me!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAppTheme {
        MyApp()
    }
}
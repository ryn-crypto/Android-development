package com.ryan.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryan.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(fraction = 0.5f)
                    .background(color = Color.Yellow)
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .background(color = Color.Blue)
                        .clip(CircleShape)
                        .background(color = Color.Cyan)
                )
                Box(
                    modifier = Modifier
                        .offset(x = 32.dp, y = 32.dp)
                        .size(64.dp)
                        .border(width = 1.dp, color = Color.Red)
                )
            }
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Red)
                        .fillMaxWidth()
                        .height(200.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Jetpack Compose")
                    Text(
                        text = "With Riyan",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Blue)
                        .fillMaxWidth()
                        .height(200.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Jetpack Compose",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(text = "With Riyan")
                }
            }
        }
    }
}
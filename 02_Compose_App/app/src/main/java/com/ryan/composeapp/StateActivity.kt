package com.ryan.composeapp

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                val checkboxState = remember { mutableStateOf(false) }
                CustomCheckBox(title = "Checkbox 1", checkboxState = checkboxState.value) {
                    checkboxState.value = !checkboxState.value
                }
            }
        }
    }
}

@Composable
fun CustomCheckBox(title: String, checkboxState: Boolean, onCheckboxPressed: ((Boolean) -> Unit)?) {
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkboxState,
            onCheckedChange = onCheckboxPressed
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = title)

    }
}
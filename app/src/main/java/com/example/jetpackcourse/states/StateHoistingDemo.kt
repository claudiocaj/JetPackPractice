package com.example.jetpackcourse.states

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme

@Composable
fun StateHoisting() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var counter by remember {
            mutableIntStateOf(0)
        }

        Counter(
            counter,
            onIncrementClick = {
                counter++
            }
        )

        Button(onClick = {
            counter = 0
        }) {
            Text(text = "Reset value")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewStateHoisting() {
    JetPackCourseTheme {
        StateHoisting()
    }
}
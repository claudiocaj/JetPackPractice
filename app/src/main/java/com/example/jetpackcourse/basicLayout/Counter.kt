package com.example.jetpackcourse.basicLayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme


@Composable
fun Counter() {
    var counter by remember {
        mutableIntStateOf(0)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            counter++
        }) {
            Text(text = "Counter: $counter")
        }
    }
}

@Composable
fun CounterThatSavesOnRotate() {
    var counter by rememberSaveable {
        mutableIntStateOf(0)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            counter++
        }) {
            Text(text = "Counter: $counter")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    JetPackCourseTheme {
        Counter()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCounterThatRotatesAndSave() {
    JetPackCourseTheme {
        CounterThatSavesOnRotate()
    }
}
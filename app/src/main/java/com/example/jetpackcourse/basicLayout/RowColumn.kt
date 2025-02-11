package com.example.jetpackcourse.basicLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme

@Composable
fun RowColumnDemo(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "HelloWorld",
            fontSize = 48.sp,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = "HelloWorld",
            fontSize = 20.sp,
            modifier = Modifier
        )
        /*Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .align(Alignment.Top)
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
        )*/
    }
}


@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun RowColumnDemoPreview() {
    JetPackCourseTheme {
        RowColumnDemo()
    }
}
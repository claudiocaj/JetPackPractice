package com.example.jetpackcourse.basicLayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcourse.R
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme


@Composable
fun BoxDemo(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null
        )

        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black)
                    )
                )

        )
        IconButton(
            onClick = {},
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                tint = Color.White,
                contentDescription = null
            )
        }
    }

}

@Preview(
    showBackground = true
)
@Composable
private fun BoxLayoutDemo() {
    JetPackCourseTheme {
        BoxDemo()
    }
}
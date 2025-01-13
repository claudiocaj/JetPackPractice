package com.example.jetpackcourse.basicLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme
import kotlin.random.Random
import kotlin.random.nextInt


@Composable
fun LazyGridDemo() {
    LazyVerticalStaggeredGrid (
        columns = StaggeredGridCells.Fixed(5),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 16.dp
    ) {
        items(40) {
            Box(
                modifier = Modifier
                    .height(Random.nextInt(1..100).dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(Random.nextInt()))
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LazyGridDemoPreview() {
    JetPackCourseTheme {
        LazyGridDemo()
    }
}
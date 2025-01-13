package com.example.jetpackcourse.basicLayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowLayoutOverflow
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowLayoutDemo() {
    FlowRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        maxItemsInEachRow = 3,
        maxLines = 4,
        overflow = FlowRowOverflow.expandOrCollapseIndicator(
            expandIndicator = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null
                    )
                }
            },
            collapseIndicator = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = null
                    )
                }
            }
        )
    ) {
        for (i in 1..30) {
            AssistChip(
                onClick = {},
                label = {
                    Text(text = "Label $i")
                }
            )
        }
    }

}

@Preview(
    showBackground = true
)
@Composable
fun PreviewFlowLayout() {
    JetPackCourseTheme {
        FlowLayoutDemo()
    }
}
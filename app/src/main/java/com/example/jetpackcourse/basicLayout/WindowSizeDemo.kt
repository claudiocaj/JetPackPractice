package com.example.jetpackcourse.basicLayout

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.jetpackcourse.ui.theme.JetPackCourseTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun WindowSizeDemo(modifier: Modifier = Modifier) {
    val windowClass = currentWindowAdaptiveInfo().windowSizeClass

    Scaffold { innerPaddings ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddings)
        ) {
            when (windowClass.windowWidthSizeClass) {
                WindowWidthSizeClass.COMPACT -> {
                    MyLazyList(modifier)
                }

                WindowWidthSizeClass.MEDIUM -> {
                    MyLazyList(modifier)
                }

                WindowWidthSizeClass.EXPANDED -> {
                    Row(modifier = modifier) {
                        Column(
                            modifier
                                .fillMaxHeight()
                                .background(Color.Red)
                                .weight(3F)
                        )
                        {
                            Text("Menu option 1")
                            Text("Menu option 2")
                            Text("Menu option 3")
                        }

                        MyLazyList(modifier.weight(7F))
                    }
                }
            }
        }
    }
}


@Composable
fun MyLazyList(modifier: Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(40) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Item $it"
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.NEXUS_10
)
@Composable
fun WindowSizeDemoPreview() {
    JetPackCourseTheme {
        WindowSizeDemo()
    }
}
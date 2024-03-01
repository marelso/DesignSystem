package com.marelso.designsystem.ui.text

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.marelso.designsystem.components.typography.BodyComponent
import com.marelso.designsystem.components.typography.CaptionComponent
import com.marelso.designsystem.components.typography.HeadlineComponent
import com.marelso.designsystem.components.typography.SubtitleComponent
import com.marelso.designsystem.components.typography.TitleComponent

@Composable
fun TextScreenHoisting(navHostController: NavHostController) {
    TextScreen()
}

@Composable
fun TextScreen() {
    Column {
        HeadlineComponent(text = "Header text")
        SubtitleComponent(text = "Header text")
        TitleComponent(text = "Header text")
        CaptionComponent(text = "Header text")
        BodyComponent(text = "Header text")
    }
}
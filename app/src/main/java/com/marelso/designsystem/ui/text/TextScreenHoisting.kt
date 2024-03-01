package com.marelso.designsystem.ui.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.marelso.designsystem.components.typography.BodyComponent
import com.marelso.designsystem.components.typography.CaptionComponent
import com.marelso.designsystem.components.typography.HeadlineComponent
import com.marelso.designsystem.components.typography.SubtitleComponent
import com.marelso.designsystem.components.typography.TitleComponent
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen4

@Composable
fun TextScreenHoisting(navHostController: NavHostController) {
    TextScreen()
}

@Composable
fun TextScreen() {
    Column(modifier = Modifier.padding(dimen4)) {
        HeadlineComponent(modifier = Modifier.padding(bottom = dimen2), text = "Header text")
        SubtitleComponent(modifier = Modifier.padding(bottom = dimen2), text = "Header text")
        TitleComponent(modifier = Modifier.padding(bottom = dimen2), text = "Header text")
        BodyComponent(modifier = Modifier.padding(bottom = dimen2), text = "Header text")
        CaptionComponent(modifier = Modifier.padding(bottom = dimen2), text = "Header text")
    }
}
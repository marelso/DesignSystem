package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.HeadlineComponent

@Composable
fun HomeHeadlineComponent(modifier: Modifier = Modifier) {
    HeadlineComponent(modifier = modifier, text = "Welcome")
}
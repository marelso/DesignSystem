package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.typography.TitleComponent

@Composable
fun HomeTitleComponent(
    modifier: Modifier = Modifier
) {
    TitleComponent(modifier = modifier, text = "Thats the current list of components")
}
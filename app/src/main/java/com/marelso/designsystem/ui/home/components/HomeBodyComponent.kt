package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.typography.BodyComponent

@Composable
fun HomeBodyComponent(modifier: Modifier = Modifier) {
    BodyComponent(modifier = modifier, text = "Here we have all the available components ready to test!")
}
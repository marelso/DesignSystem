package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.button.ActionButtonComponent
import com.marelso.designsystem.components.button.data.ButtonAction

@Composable
fun HomeChipComponent(modifier: Modifier = Modifier, onClick: () -> Unit) {
    ActionButtonComponent(action = ButtonAction(
        label = "Chip components",
        isOutlined = false,
        onClick = { onClick.invoke() }
    ), modifier = modifier)
}
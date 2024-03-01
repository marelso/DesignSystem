package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.button.ActionButtonComponent
import com.marelso.designsystem.components.button.data.ButtonAction

@Composable
fun HomeTextComponent(modifier: Modifier = Modifier, onClick: () -> Unit) {
    ActionButtonComponent(action = ButtonAction(
        label = "Text components",
        isOutlined = false,
        onClick = { onClick.invoke() }
    ), modifier = modifier)
}
package com.marelso.designsystem.ui.home.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.components.button.ActionButtonComponent
import com.marelso.designsystem.components.button.data.ButtonAction

@Composable
fun HomeCardComponent(modifier: Modifier = Modifier, onClick: () -> Unit) {
    ActionButtonComponent(action = ButtonAction(
        label = "Card components",
        isOutlined = false,
        onClick = { onClick.invoke() }
    ), modifier = modifier)
}
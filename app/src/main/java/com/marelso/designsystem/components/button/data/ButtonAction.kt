package com.marelso.designsystem.components.button.data

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import com.marelso.designsystem.ui.theme.dimen2

data class ButtonAction(
    val label: String? = null,
    val isOutlined: Boolean = false,
    val contentTint: Color? = null,
    val backgroundTint: Color? = null,
    @DrawableRes val trailingIcon: Int? = null,
    @DrawableRes val leadingIcon: Int? = null,
    val radius: Dp = dimen2,
    val onClick: () -> Unit,
)
package com.marelso.designsystem.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.marelso.designsystem.components.button.data.ButtonAction
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen6

@Composable
fun ActionButtonComponent(modifier: Modifier = Modifier, action: ButtonAction) {
    if (action.isOutlined) {
        val contentColor = action.contentTint ?: MaterialTheme.colorScheme.primary
        val backgroundColor = action.backgroundTint ?: MaterialTheme.colorScheme.onPrimary
        OutlinedButton(
            onClick = { action.onClick.invoke() },
            shape = RoundedCornerShape(action.radius),
            colors = ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = contentColor
            ),
            modifier = modifier
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                action.leadingIcon?.let {
                    Icon(
                        painter = painterResource(it),
                        modifier = Modifier
                            .height(dimen6)
                            .width(dimen6),
                        tint = contentColor,
                        contentDescription = "Action for ${action.label}"
                    )
                }

                action.label?.let {
                    Text(
                        text = it,
                        maxLines = 1,
                        color = contentColor
                    )
                }

                action.trailingIcon?.let {
                    Icon(
                        painter = painterResource(it),
                        modifier = Modifier
                            .height(dimen6)
                            .width(dimen6),
                        tint = contentColor,
                        contentDescription = "Action for ${action.label}"
                    )
                }
            }
        }
    } else {
        val contentColor = action.contentTint ?: MaterialTheme.colorScheme.surface
        val backgroundColor = action.backgroundTint ?: MaterialTheme.colorScheme.primary
        Button(
            onClick = { action.onClick.invoke() },
            colors = ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = contentColor
            ),
            shape = RoundedCornerShape(action.radius)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                action.leadingIcon?.let {
                    Icon(
                        painter = painterResource(it),
                        modifier = Modifier
                            .height(dimen6)
                            .width(dimen6),
                        tint = contentColor,
                        contentDescription = "Action for ${action.label}"
                    )
                }

                action.label?.let {
                    Text(
                        text = it,
                        maxLines = 1,
                        color = contentColor
                    )
                }

                action.trailingIcon?.let {
                    Icon(
                        painter = painterResource(it),
                        modifier = Modifier
                            .height(dimen6)
                            .width(dimen6),
                        tint = contentColor,
                        contentDescription = "Action for ${action.label}"
                    )
                }
            }
        }
    }
}
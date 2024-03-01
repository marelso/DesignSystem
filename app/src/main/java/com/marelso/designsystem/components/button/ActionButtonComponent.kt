package com.marelso.designsystem.components.button

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.marelso.designsystem.components.button.data.ButtonAction
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen6

@Composable
fun ActionButtonComponent(modifier: Modifier = Modifier, action: ButtonAction) {
    val contentColor = action.contentTint ?: MaterialTheme.colorScheme.surface
    val backgroundColor = action.backgroundTint ?: MaterialTheme.colorScheme.primary
    if (action.isOutlined) {
        OutlinedButton(onClick = { /*TODO*/ }, shape = RoundedCornerShape(action.radius)) {
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
                    painter =  painterResource(it),
                    modifier = Modifier
                        .height(dimen6)
                        .width(dimen6),
                    tint = contentColor,
                    contentDescription = "Action for ${action.label}"
                )
            }
        }
    } else {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = backgroundColor,
                contentColor = contentColor
            ),
            shape = RoundedCornerShape(action.radius)
        ) {
            action.leadingIcon?.let {
                Icon(
                    painter =  painterResource(it),
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
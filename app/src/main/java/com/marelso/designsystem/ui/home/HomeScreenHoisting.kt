package com.marelso.designsystem.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.ui.home.components.HomeCaptionComponent
import com.marelso.designsystem.ui.home.components.HomeHeadlineComponent
import com.marelso.designsystem.ui.home.components.HomeSubtitleComponent
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen4

@Composable
fun HomeScreenHoisting() {
    Column(modifier = Modifier.padding(dimen4)) {
        HomeHeadlineComponent(modifier = Modifier.padding(bottom = dimen2))
        HomeSubtitleComponent(modifier = Modifier.padding(bottom = dimen2))
        HomeCaptionComponent(modifier = Modifier.padding(bottom = dimen2))
    }
}
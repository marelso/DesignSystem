package com.marelso.designsystem.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.marelso.designsystem.ui.home.components.HomeBodyComponent
import com.marelso.designsystem.ui.home.components.HomeButtonComponent
import com.marelso.designsystem.ui.home.components.HomeHeadlineComponent
import com.marelso.designsystem.ui.home.components.HomeSubtitleComponent
import com.marelso.designsystem.ui.home.components.HomeTextComponent
import com.marelso.designsystem.ui.home.components.HomeTitleComponent
import com.marelso.designsystem.ui.theme.dimen2
import com.marelso.designsystem.ui.theme.dimen4

@Composable
fun HomeScreenHoisting() {
    Column(modifier = Modifier.padding(dimen4)) {
        HomeHeadlineComponent(modifier = Modifier.padding(bottom = dimen2))
        HomeSubtitleComponent(modifier = Modifier.padding(bottom = dimen2))
        HomeBodyComponent(modifier = Modifier.padding(bottom = dimen4))
        HomeTitleComponent(modifier = Modifier.padding(bottom = dimen2))
        HomeButtonComponent(modifier = Modifier.padding(bottom = dimen2), onClick = {})
        HomeTextComponent(modifier = Modifier.padding(bottom = dimen2), onClick = {})
        HomeCollapsableText(modifier = Modifier.padding(bottom = dimen2), onClick = {})
    }
}
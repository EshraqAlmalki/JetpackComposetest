package com.tuwaiq.jetpackcomposetest

import androidx.compose.ui.graphics.vector.ImageVector

data class DrawerItem (
    val id: String,
    val title:String,
    var icon: ImageVector,
    var contentDescription:String
        )
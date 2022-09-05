package com.tuwaiq.jetpackcomposetest

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

class NewCourses {


}

@Composable
fun NewCoursesContent(navigateToInfo: (Course) -> Unit){
    val courses = remember {
        DataProvider.categoryList
    }
    LazyColumn(contentPadding = PaddingValues(
        horizontal = 16.dp ,
        vertical = 8.dp)
    ){
        items( items = courses,
        itemContent = {
            CoursesListItem(course = it, navigateToInfo)

        })
    }
}


package com.tuwaiq.jetpackcomposetest

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CoursesListItem(course: Course, navigateToInfo : (Course) -> Unit) {
   Card(modifier = Modifier
       .padding(
           horizontal = 8.dp,
           vertical = 8.dp
       )
       .fillMaxWidth(), elevation = 2.dp,

       shape = RoundedCornerShape(corner = CornerSize(16.dp))){
       Row(Modifier.clickable { navigateToInfo(course) }) {
           setImg(course = course)
           Column(modifier = Modifier
               .padding(16.dp)
               .fillMaxWidth()
               .align(Alignment.CenterVertically)) {
               Text(text = course.name, style = typography.h6)
               Text(text = "view details", style = typography.caption)

           }

       }
   }

}
package com.tuwaiq.jetpackcomposetest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class InfoScreen {
}

@Composable
fun InfoScreen(course:Course){
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                ) {
                    InfoHeader(course,
                        this@BoxWithConstraints.maxHeight)
                    InfoContent(course, )
                }

            }

        }

    }
}

@Composable
fun InfoHeader(course: Course, containerHeight:Dp){

    Image(modifier = Modifier
        .heightIn(max = containerHeight / 2)
        .fillMaxWidth()
        , painter = painterResource(id = course.photo)
        , contentScale = ContentScale.Crop
        , contentDescription = null)
}

@Composable
fun InfoContent(course: Course){

    Column {
        Title(course)
        InfoProperty(stringResource(R.string.description) , course.des)
        InfoProperty(stringResource(R.string.duration) , course.duration.toString())

    }

}

@Composable
fun Title(course: Course){
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp,
        bottom = 16.dp, top = 16.dp)) {
        Text(text = course.name,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InfoProperty(label:String,value:String){
    Column(modifier = Modifier.padding(start = 16.dp,
        end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 16.dp))

        Text(text = label , modifier = Modifier.height(24.dp),
        style = MaterialTheme.typography.caption)

        Text(text = value , modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible)
    }
}
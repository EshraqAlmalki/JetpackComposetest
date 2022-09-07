package com.tuwaiq.jetpackcomposetest

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Resources
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tuwaiq.jetpackcomposetest.ui.theme.MyProjectTheme
import java.io.Serializable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProjectTheme{
                MyApp{
                    startActivity(InfoActivity.newIntent(this, it))
                }
            }

            }
    }
}



@Composable
fun MyApp(navigateToInfo: (Course) -> Unit) {
    Scaffold(
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                
            }
            NewCoursesContent(navigateToInfo = navigateToInfo)
        }
    )
}

@Composable
fun ImageCard(
    painter:Painter,
    contentDescription:String,
    title:String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ){
        Box(modifier = Modifier.width(200.dp)) {
            Image(painter = painter, contentDescription =contentDescription , contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Yellow
                        ),
                        startY = 300f

                    )
                ))
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(color = Color.Blue, fontSize = 16.sp))
            }
        }

    }



}


data class Course(
    val name:String,
    val duration:Int,
    val photo:Int = 0,
    val des:String
) : Serializable

object DataProvider{
    val categoryList = listOf(
        Course(
           "programming0",
            2,
            R.drawable.tuwaiq,
            "Kotlin development"
        ),
        Course(
            "programming1",
            2,
            R.drawable.tuwaiq,
            "Java development"
        ),
        Course(
            "programming2",
            2,
            R.drawable.tuwaiq,
            "C+ development"
        ),
        Course(
            "programming3",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming4",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming5",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming6",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming7",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming8",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming9",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming10",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        ),
        Course(
            "programming11",
            2,
            R.drawable.tuwaiq,
            "Swift development"
        )
    )
}

@Composable
fun setImg(course: Course){
    Image(
        painter = painterResource(id = course.photo),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(CornerSize(16.dp)))
    )
}


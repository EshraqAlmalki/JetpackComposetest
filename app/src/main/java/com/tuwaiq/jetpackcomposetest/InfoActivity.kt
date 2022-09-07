package com.tuwaiq.jetpackcomposetest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.tuwaiq.jetpackcomposetest.ui.theme.MyProjectTheme

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProjectTheme {
                InfoScreen(course = course)
            }
        }
    }

    private val course : Course by lazy {
        intent?.getSerializableExtra(COURSE_ID) as Course
    }

    companion object{
        private const val COURSE_ID = "course_id"

        fun newIntent(context: Context, course: Course) =
            Intent(context, InfoActivity::class.java).apply {
                putExtra(COURSE_ID, course)
            }
    }
}


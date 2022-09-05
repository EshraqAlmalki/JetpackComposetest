package com.tuwaiq.jetpackcomposetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.tuwaiq.jetpackcomposetest.ui.theme.JetpackComposetestTheme

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            JetpackComposetestTheme {
                Text(text = "Hello world")
            }
        }
    }
}
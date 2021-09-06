package com.example.tutorial3sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.graphics.drawable.AnimationDrawable
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var frameAnimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get the Image View
        val view = findViewById<ImageView>(R.id.imageGallery)
        // Setting animation_list.xml as the foreground of the image view
    }

    fun backFunction(view:View) {
    }

    fun nextFunction(view:View) {
    }
}
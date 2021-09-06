package com.example.tutorial3sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.graphics.drawable.AnimationDrawable
import android.view.View

class MainActivity : AppCompatActivity() {
    val picture:IntArray=intArrayOf(R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5)
    lateinit var pictureView:ImageView
    var picNum=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get the Image View
        pictureView = findViewById<ImageView>(R.id.imageGallery)
        // Setting animation_list.xml as the foreground of the image view
        pictureView.setBackgroundResource(picture[picNum])
    }

    fun nextFunction(view:View) {
        picNum=(picNum+1)%picture.size
        pictureView.setBackgroundResource(picture[picNum])
    }
}
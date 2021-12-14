package com.example.sharedPreferencesTry

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val picture:IntArray=intArrayOf(R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5)
    lateinit var pictureView:ImageView
    var picNum=0
    lateinit var showPicNum:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        picNum = prefs.getInt("picNum", 0)

        setContentView(R.layout.activity_main)
        // Get the Image View
        pictureView = findViewById<ImageView>(R.id.imageGallery)
        // Setting animation_list.xml as the foreground of the image view
        pictureView.setBackgroundResource(picture[picNum])
        showPicNum = findViewById(R.id.picNumIndicator)
        showPicNum.setText("Picture number "+picNum)
    }

    fun nextFunction(view:View) {
        picNum=(picNum+1)%picture.size
        pictureView.setBackgroundResource(picture[picNum])
        showPicNum.setText("Picture number "+picNum)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("picNum",picNum)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        picNum=savedInstanceState.getInt("picNum")
        pictureView.setBackgroundResource(picture[picNum])
    }

    override fun onPause() {
        super.onPause()

        val prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.putInt("picNum",picNum)
        editor.apply()
    }
}
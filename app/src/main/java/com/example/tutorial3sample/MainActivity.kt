package com.example.tutorial3sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.graphics.drawable.AnimationDrawable

class MainActivity : AppCompatActivity() {
    private lateinit var frameAnimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Get the Image View
        val view = findViewById(R.id.imageAnimation) as ImageView
        // Setting animation_list.xml as the foreground of the image view
        view.setBackgroundResource(R.drawable.animation_list)
        // Get the Animation Drawable
        frameAnimation = view.getBackground() as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) frameAnimation.start()    // Start the animation when in Focus
        else frameAnimation.stop()              // and stop it when not in Focus
    }
}
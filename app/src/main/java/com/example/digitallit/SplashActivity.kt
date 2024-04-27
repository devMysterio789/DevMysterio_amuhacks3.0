package com.example.digitallit

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.progressindicator.LinearProgressIndicator

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val prog = findViewById<LinearProgressIndicator>(R.id.linearProgressIndicator)
        prog.isIndeterminate = true

        val imageView = findViewById<AppCompatImageView>(R.id.imageView)

        // Load the animation
        val zoomInAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)

        // Start the animation on the ImageView
        imageView.startAnimation(zoomInAnimation)

        // Optionally, set a listener to handle animation end
        zoomInAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
                // Start the next activity after animation ends
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish() // Optional: finish the current activity
            }

            override fun onAnimationRepeat(animation: Animation?) {
            }
        })
    }
}
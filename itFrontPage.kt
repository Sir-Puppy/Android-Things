package com.example.test1

import android.R.attr
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.R.attr.animation
import android.content.Intent

import android.graphics.drawable.AnimationDrawable
import android.widget.Button
import android.widget.Toast
import android.text.method.ScrollingMovementMethod





class itFrontPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_it_front_page)

        val textView9 = findViewById<TextView>(R.id.textView9)

        val animationRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate_text)

        val textView10 = findViewById<TextView>(R.id.textView10)

        textView10.setMovementMethod(ScrollingMovementMethod())

        animationRotate.setFillAfter(true)
        textView9.startAnimation(animationRotate);
        }
    }




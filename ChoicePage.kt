package com.example.test1


import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class ChoicePage : AppCompatActivity() {
    private lateinit var layout: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        layout = findViewById(R.id.relativeLayout)
        layout.setOnTouchListener(object : OnSwipeTouchListener(this@ChoicePage) {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(this@ChoicePage, "Swipe Left gesture detected",
                    Toast.LENGTH_SHORT)
                    .show()
            }
            override fun onSwipeRight() {
                super.onSwipeRight()
                val intent = Intent(this@ChoicePage, itFrontPage::class.java)
                startActivity(intent);
                overridePendingTransition(R.anim.anim_swipe_in_top, R.anim.anim_swipe_out_left)

            }
            override fun onSwipeUp() {
                super.onSwipeUp()
                Toast.makeText(this@ChoicePage, "Swipe up gesture detected", Toast.LENGTH_SHORT)
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                Toast.makeText(this@ChoicePage, "Swipe down gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }
}

































































package com.example.test1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.button) as TextView
            // set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "Please Wait", Toast.LENGTH_SHORT).show()
            myTextView.text = "Logging In"

            val intent = Intent(this, ChoicePage::class.java)
            startActivity(intent);
            }

        }


    }

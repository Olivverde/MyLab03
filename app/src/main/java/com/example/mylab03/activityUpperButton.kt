package com.example.mylab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class activityUpperButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upper_button)

        //Get the text from last activity
        val name = intent.getStringExtra(EXTRA_NAME)

        //Edit TextView
        val showName = findViewById<TextView>(R.id.nameView).apply {
            text = name
        }
    }

    fun exitUpperButton(view: TextView){
        finish()
    }
}

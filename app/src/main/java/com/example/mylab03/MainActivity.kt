package com.example.mylab03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

//Key
const val EXTRA_NAME = "com.example.mylab03.NAME"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Starts upper button activity
     */
    fun upperButtonActivity(view: View){

        //Declaring editText
        val editText = findViewById<EditText>(R.id.editText)
        //Value
        val name = editText.text.toString()
        //Creating intent
        val intent = Intent(this, activityUpperButton::class.java).apply {
            putExtra(EXTRA_NAME,name)
        }
        startActivity(intent)

    }
}

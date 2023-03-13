package com.example.task21p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputField = findViewById<EditText>(R.id.textbox)
        val submitBtn = findViewById<Button>(R.id.button)
        val label = findViewById<TextView>(R.id.textView)

        submitBtn.setOnClickListener{
            val enteredValue = inputField.text.toString();
            val message = "Welcome to SIT305 $enteredValue!"
            label.text = message;
        }
    }


}
package com.eziz.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val seeText: TextView = findViewById(R.id.seeText)
        val addName: EditText = findViewById(R.id.addName)
        button.setOnClickListener {
            seeText.text = addName.text
            addName.text.clear()
        }
    }
}
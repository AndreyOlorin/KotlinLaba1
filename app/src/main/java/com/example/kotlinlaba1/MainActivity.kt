package com.example.kotlinlaba1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startButton)
        val textView = findViewById<TextView>(R.id.textView)
        val numberOfSeason = findViewById<EditText>(R.id.numberOfSeason)

        button.setOnClickListener(){
            when (numberOfSeason.text.toString()) {
                "1" -> textView.text = "Зима"
                "2" -> textView.text = "Весна"
                "3" -> textView.text = "Лето"
                "4" -> textView.text = "Осень"
                else -> {
                    textView.text = "Ошибка"
                }
            }
        }
    }
}
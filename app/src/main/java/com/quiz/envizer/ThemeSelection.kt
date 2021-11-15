package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThemeSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme_selection)

        val btn_continue = findViewById<Button>(R.id.btn_continue);
        btn_continue.setOnClickListener {
            val intent = Intent(this,SolvingQuiz::class.java)
            startActivity(intent)
            finish()
        }

    }
}
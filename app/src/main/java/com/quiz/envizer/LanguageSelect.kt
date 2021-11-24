package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class LanguageSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_select)
        //bottom page animation
        val bottom_animation = AnimationUtils.loadAnimation(applicationContext,R.anim.translate_up)
        var bottomPage = findViewById<ConstraintLayout>(R.id.bottomLayout)
        bottomPage.setVisibility(View.VISIBLE);
        bottomPage.startAnimation(bottom_animation)


        val btn_continue = findViewById<Button>(R.id.btn_continue);
        btn_continue.setOnClickListener {
            val intent = Intent(this,ThemeSelection::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }
    }
}
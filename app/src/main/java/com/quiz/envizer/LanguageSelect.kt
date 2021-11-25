package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
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

        //AccountDetails(계정정보 변경) 페이지로 이동
        val btn_change_avatar = findViewById<ImageView>(R.id.btn_change_avatar)
        btn_change_avatar.setOnClickListener {
            val intent = Intent(this,AccountDetails::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }


        //next page
        val btn_continue = findViewById<Button>(R.id.btn_continue);
        btn_continue.setOnClickListener {
            val intent = Intent(this,ThemeSelection::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }


    }


}
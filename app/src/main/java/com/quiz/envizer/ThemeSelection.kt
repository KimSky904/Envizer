package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ThemeSelection : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theme_selection)
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

    }


    override fun onClick(view: View) {
        var themeValue = 0
        val intent = Intent(this,SolvingQuiz::class.java)
        when(view?.id){
            R.id.theme_solar -> themeValue = 1
            R.id.theme_wind  -> themeValue = 2
            R.id.theme_hydro -> themeValue = 3
            R.id.theme_geo   -> themeValue = 4
        }
        intent.putExtra("themeValue",themeValue)
        startActivity(intent)
        overridePendingTransition(0, 0)
        finish()
    }

}
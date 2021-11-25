package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import org.json.JSONException

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)
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

        //server -> 정답 여부 list json 전달받기
        //임시 리스트 ( 0 : false, 1 : true )
        var isCorrectList = "[ 0, 1, 1, 0, 1, 1, 1, 0 ]"
        try {
            for(i in 0..7){

            }
        } catch ( e : JSONException){
            e.printStackTrace()
        }

    }
}
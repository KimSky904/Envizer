package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import org.json.JSONException
import org.json.JSONObject

class SolvingQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solving_quiz)
        //bottom page animation
        val bottom_animation = AnimationUtils.loadAnimation(applicationContext,R.anim.translate_up)
        var bottomPage = findViewById<ConstraintLayout>(R.id.bottomLayout)
        bottomPage.setVisibility(View.VISIBLE);
        bottomPage.startAnimation(bottom_animation)



        val themeValue = intent.getIntExtra("themeValue",1)
        //서버에 themeValue값 전달, 테마문제 받아오기
        //서버는 android로 문제를 json에 담아서 줌 (json 내용 -> 문제(영/한),보기)
        //문제점 1 : 채점을 서버에서 한번에 처리하는데, 그럼 아바타 캐릭터중 틀린답을 골랐을 경우를 구분 못함(답을 서버에서 받아오지 않음)

        //임시 json
        val server_jsonValue = "[{quiz:\"문제1\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제2\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제3\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제4\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제5\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제6\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제7\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"},{quiz:\"문제8\",options_1:\"보기1\",options_2:\"보기2\",options_3:\"보기3\",options_4:\"보기4\"}]"

        //json to string array
        val quizArray = arrayOf<String>()
        var count = 0
        try {
            val jsonValue = JSONObject(server_jsonValue)
        } catch (e : JSONException) {
            e.printStackTrace()
        }


        val btn_previous = findViewById<ImageView>(R.id.btn_previous);
        val btn_next = findViewById<ImageView>(R.id.btn_next);
        btn_previous.setOnClickListener {        }
        btn_next.setOnClickListener {
            //사용자 선택값 json -> server로 전달
            val intent = Intent(this,ResultScreen::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }

    }
}
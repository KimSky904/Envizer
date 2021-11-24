package com.quiz.envizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONException

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

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
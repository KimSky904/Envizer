package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateAvatar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_avatar)

        //server에서 avatarlist,point 받음 ( 신규 사용자의 경우 [0,0,0,..] list와 0 point )
        //임시 avatar list json

        //임시 user point

        val btn_continue = findViewById<Button>(R.id.btn_continue);
        btn_continue.setOnClickListener {
            val intent = Intent(this,LanguageSelect::class.java)
            startActivity(intent)
            finish()
        }

    }
}
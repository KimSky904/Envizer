package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val btn_choosdAvatar = findViewById<ImageView>(R.id.select_avatar);
        btn_choosdAvatar.setOnClickListener {
            //아바타 선택 팝업 띄우기
            //아바타 선택 후
        }

        val btn_continue = findViewById<Button>(R.id.btn_continue);
        btn_continue.setOnClickListener {
            val intent = Intent(this,LanguageSelect::class.java)
            startActivity(intent)
            finish()
        }

    }
}
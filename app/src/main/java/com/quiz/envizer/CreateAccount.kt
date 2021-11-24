package com.quiz.envizer

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        //bottom page animation
        val bottom_animation = AnimationUtils.loadAnimation(applicationContext,R.anim.translate_up)
        var bottomPage = findViewById<ConstraintLayout>(R.id.bottomLayout)
        bottomPage.setVisibility(View.VISIBLE);
        bottomPage.startAnimation(bottom_animation)

        val edittxt_username = findViewById<EditText>(R.id.editText)
        val btn_continue = findViewById<Button>(R.id.btn_continue)

        //text watcher
        val textWatcher = object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("checking","beforeTextChanged")
                btn_continue.isClickable = false
                btn_continue.setBackgroundResource(R.drawable.btn_round_style_nonavailable)
                btn_continue.setTextColor(resources.getColor(R.color.black))
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {
                if(!edittxt_username.text.trim().isEmpty()){
                    Log.d("checking","afterTextChanged - text exists")
                    btn_continue.isClickable = true
                    btn_continue.setBackgroundResource(R.drawable.btn_round_style)
                    btn_continue.setTextColor(resources.getColor(R.color.white))
                } else {
                    Log.d("checking","afterTextChanged - no text")
                    btn_continue.isClickable = false
                    btn_continue.setBackgroundResource(R.drawable.btn_round_style_nonavailable)
                    btn_continue.setTextColor(resources.getColor(R.color.black))
                }
            }
        }

        //버튼 누름과 동시에 server로 이름값 전송
        btn_continue.setOnClickListener {
            val intent = Intent(this,CreateAvatar::class.java)
            startActivity(intent)
            finish()
        }

    }
}


/**
 *
 * 기존 Energizer와 동일
+ 첫번째 아바타는 이전에 사용했던 아바타로 불러옴 -> 아바타 class 필요
+ 소유 아바타 수에 따라 unknown, available로 구분 (unknown은 ?로 표시)
 *
 */
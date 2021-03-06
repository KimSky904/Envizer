package com.quiz.envizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
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

        //?????? ????????? ????????? server??? ????????? ??????
        btn_continue.setOnClickListener {
            val intent = Intent(this,CreateAvatar::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }

    }
}


/**
 *
 * ?????? Energizer??? ??????
+ ????????? ???????????? ????????? ???????????? ???????????? ????????? -> ????????? class ??????
+ ?????? ????????? ?????? ?????? unknown, available??? ?????? (unknown??? ???? ??????)
 *
 */
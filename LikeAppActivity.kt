package com.example.likeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_like_app.*
import kotlinx.android.synthetic.main.activity_reg.*

class LikeAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_like_app)


        btn_likeApp.setOnClickListener {
            val tabIntent = Intent(this, TabActivity::class.java)
            startActivity(tabIntent)
        }
    }
}
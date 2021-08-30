package com.example.likeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        clk_reg.setOnClickListener {
            val clkIntent = Intent(this, RegActivity::class.java)
            startActivity(clkIntent)
        }


        btn_login.setOnClickListener {

            val email = et_email.text.toString()
            val pass = et_pass.text.toString()


            if (email.isEmpty() && pass.isEmpty()){
                Toast.makeText(this, "Fill in the details!", Toast.LENGTH_SHORT).show()
            }else{
                val appIntent = Intent(this, LikeAppActivity::class.java)
                startActivity(appIntent)
            }
        }
    }
}
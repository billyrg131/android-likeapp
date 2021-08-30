package com.example.likeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reg.*

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        btn_reg.setOnClickListener {

            val name = et_username.text.toString()
            val email = et_email1.text.toString()
            val pass = et_pass1.text.toString()


            if (name.isEmpty() && email.isEmpty() && pass.isEmpty()){
                Toast.makeText(this, "Fill in the details!", Toast.LENGTH_SHORT).show()
            } else{
                val regIntent = Intent(this, SignInActivity::class.java)
                startActivity(regIntent)
            }
        }
    }
}
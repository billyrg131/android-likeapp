package com.example.likeapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Quitting LikeApp")
        alert.setMessage("Are you sure you want to quit?")
        alert.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        alert.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
        alert.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_explore.setOnClickListener {
            val loginIntent = Intent(this, SignInActivity::class.java)
            startActivity(loginIntent)
        }
    }
}
package com.example.android.tactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = editText.text

        btnProfile.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("text", "$text")
            startActivity(intent)

        }

    }
}

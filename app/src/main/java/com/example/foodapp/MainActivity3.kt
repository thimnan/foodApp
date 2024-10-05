package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var imageView = findViewById<ImageView>(R.id.imageView5)
        imageView.setOnClickListener {
            val intent1 = Intent(this, MainActivity4::class.java)
            startActivity(intent1)

            var imageView = findViewById<ImageView>(R.id.imageView6)
            imageView.setOnClickListener {
                val intent1 = Intent(this, MainActivity5::class.java)
                startActivity(intent1)

                var imageView = findViewById<ImageView>(R.id.imageView7)
                imageView.setOnClickListener {
                    val intent1 = Intent(this, MainActivity6::class.java)
                    startActivity(intent1)
                }
            }
        }
    }
}
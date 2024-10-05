package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var imageView = findViewById<ImageView>(R.id.imageView12)
        imageView.setOnClickListener {
            val intent1 = Intent(this, CheckoutActivity::class.java)
            startActivity(intent1)

            var imageView = findViewById<ImageView>(R.id.imageView13)
            imageView.setOnClickListener {
                val intent1 = Intent(this, CheckoutActivity::class.java)
                startActivity(intent1)

                var imageView = findViewById<ImageView>(R.id.imageView14)
                imageView.setOnClickListener {
                    val intent1 = Intent(this, CheckoutActivity::class.java)
                    startActivity(intent1)
                }
            }
        }
    }
}
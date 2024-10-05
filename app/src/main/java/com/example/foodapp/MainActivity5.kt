package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var imageView = findViewById<ImageView>(R.id.imageView9)
        imageView.setOnClickListener {
            val intent1 = Intent(this, CheckoutActivity::class.java)
            startActivity(intent1)

            var imageView = findViewById<ImageView>(R.id.imageView10)
            imageView.setOnClickListener {
                val intent1 = Intent(this, CheckoutActivity::class.java)
                startActivity(intent1)

                var imageView = findViewById<ImageView>(R.id.imageView11)
                imageView.setOnClickListener {
                    val intent1 = Intent(this, CheckoutActivity::class.java)
                    startActivity(intent1)
                }
            }
        }
    }
}
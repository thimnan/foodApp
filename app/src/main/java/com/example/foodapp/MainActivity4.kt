package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)



        var imageView = findViewById<ImageView>(R.id.imageView3)
        imageView.setOnClickListener {
            val intent1 = Intent(this, CheckoutActivity::class.java)
            startActivity(intent1)

            var imageView = findViewById<ImageView>(R.id.imageView8)
            imageView.setOnClickListener {
                val intent1 = Intent(this, CheckoutActivity::class.java)
                startActivity(intent1)

                var imageView = findViewById<ImageView>(R.id.imageView4)
                imageView.setOnClickListener {
                    val intent1 = Intent(this, CheckoutActivity::class.java)
                    startActivity(intent1)


                }
            }
        }
    }
}

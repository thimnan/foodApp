package com.example.foodapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    private lateinit var cartItemsList: TextView
    private lateinit var totalAmountText: TextView
    private lateinit var payButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout) // Use your layout name

        // Initialize views
        cartItemsList = findViewById(R.id.cartItemsList)
        totalAmountText = findViewById(R.id.totalAmountText)
        payButton = findViewById(R.id.payButton)



        // Handle pay button click
        payButton.setOnClickListener {
            // Show a toast message when the pay button is clicked
            Toast.makeText(this, "Your food is on the way!", Toast.LENGTH_LONG).show()


        }
    }
}








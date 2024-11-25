package com.example.assignment_3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assingment_3.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val tvFinalData: TextView = findViewById(R.id.tv_final_data)

        // Get the final data from Intent
        val finalData = intent.getStringExtra("finalData") ?: ""

        // Display the final data in TextView
        tvFinalData.text = finalData
    }
}
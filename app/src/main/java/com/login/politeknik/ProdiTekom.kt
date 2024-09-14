package com.login.politeknik

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProdiTekom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prodi_tekom)

        // Back button functionality
        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            finish() // Closes the activity and goes back to the previous screen
        }

    }
}
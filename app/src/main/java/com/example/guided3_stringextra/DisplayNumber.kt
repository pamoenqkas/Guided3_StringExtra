package com.example.guided3_stringextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent: Intent = intent
        val message: String? = intent.getStringExtra("InputanAngka")

        val textView = TextView(this)
        textView.setTextSize(40f)
        textView.setText("Angka yang anda inputkan adalah " + message)

        setContentView(textView)
    }
}
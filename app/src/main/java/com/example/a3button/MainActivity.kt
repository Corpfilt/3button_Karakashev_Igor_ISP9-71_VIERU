package com.example.a3button

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    // Всплывающее сообщение
    fun toastMe(view: View) {
        Toast.makeText(
            this,
            "Hello Toast!",
            Toast.LENGTH_SHORT
        ).show()
    }

    // Увеличение счетчика
    fun countMe(view: View) {
        var count = textView.text.toString().toInt()
        count++
        textView.text = count.toString()
    }

    // Уменьшение счетчика
    fun minusMe(view: View) {
        var count = textView.text.toString().toInt()
        count--
        textView.text = count.toString()
    }

    // Открытие второго экрана
    fun randomMe(view: View) {
        val count = textView.text.toString().toInt()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(intent)
    }
}

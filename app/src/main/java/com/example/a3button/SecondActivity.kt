package com.example.a3button

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    private fun showRandomNumber() {

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val randomNumber = if (count > 0) {
            Random.nextInt(count + 1)
        } else {
            0
        }

        val randomText = findViewById<TextView>(
            R.id.textview_random
        )

        val labelText = findViewById<TextView>(
            R.id.textview_label
        )

        randomText.text = randomNumber.toString()

        labelText.text = getString(
            R.string.random_heading,
            count
        )
    }
}

package com.avalitov.randomer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    internal lateinit var getRandomButton: Button
    internal lateinit var randomNumberTextView: TextView

//    companion object Default : Random() {
//        override fun nextBits(bitCount: Int): Int {
//            TODO("Not yet implemented")
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRandomButton = findViewById(R.id.getRandomButton)
        randomNumberTextView = findViewById(R.id.randomNumberTextView)

        getRandomButton.setOnClickListener() { view ->
            getNewRandom()
        }
    }

    private fun getNewRandom() {
        var random = Random.nextInt(1,101)
        randomNumberTextView.text = random.toString()
    }

}
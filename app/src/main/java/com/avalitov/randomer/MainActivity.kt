package com.avalitov.randomer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    internal lateinit var getRandomButton: Button
    internal lateinit var randomNumberTextView: TextView
    private var random: Int = 0
    var randomGeneratorInstance = RandomGenerator()

    companion object {
        private const val RANDOM_KEY = "RANDOM_KEY"               //is needed to save instance state
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRandomButton = findViewById(R.id.getRandomButton)
        randomNumberTextView = findViewById(R.id.randomNumberTextView)

        getRandomButton.setOnClickListener() { view ->
            random = randomGeneratorInstance.getNewRandom(1, 101)
            randomNumberTextView.text = random.toString()
        }

        if(savedInstanceState != null) {
            random = savedInstanceState.getInt(RANDOM_KEY)
            randomNumberTextView.text = random.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(RANDOM_KEY, random)
    }

    private fun getNewRandom() {
        random = Random.nextInt(1,101)
        randomNumberTextView.text = random.toString()
    }



}
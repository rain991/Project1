package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zeroButton = findViewById<Button>(R.id.zero_button)
        val oneButton = findViewById<Button>(R.id.one_button)
        val twoButton = findViewById<Button>(R.id.two_button)
        val threeButton = findViewById<Button>(R.id.three_button)
        val fourButton = findViewById<Button>(R.id.four_button)
        val fiveButton = findViewById<Button>(R.id.five_button)
        val sixButton = findViewById<Button>(R.id.six_button)
        val sevenButton = findViewById<Button>(R.id.seven_button)
        val eightButton = findViewById<Button>(R.id.eight_button)
        val nineButton = findViewById<Button>(R.id.nine_button)

        val pointButton = findViewById<Button>(R.id.point_button)
        val plusButton = findViewById<Button>(R.id.plus_button)
        val minusButton = findViewById<Button>(R.id.minus_button)
        val multiplyButton = findViewById<Button>(R.id.multiply_button)
        val equalButton = findViewById<Button>(R.id.equal_button)

        val resultTextView = findViewById<TextView>(R.id.result_TextView)
        val numberStringBuilder = StringBuilder()
        zeroButton.setOnClickListener{
        numberStringBuilder.append(0)
            resultTextView.text = numberStringBuilder
        }
        oneButton.setOnClickListener{
            numberStringBuilder.append(1)
            resultTextView.text = numberStringBuilder
        }
        twoButton.setOnClickListener{
            numberStringBuilder.append(2)
            resultTextView.text = numberStringBuilder
        }
        threeButton.setOnClickListener{
            numberStringBuilder.append(3)
            resultTextView.text = numberStringBuilder
        }
        fourButton.setOnClickListener{
            numberStringBuilder.append(4)
            resultTextView.text = numberStringBuilder
        }
        fiveButton.setOnClickListener{
            numberStringBuilder.append(5)
            resultTextView.text = numberStringBuilder
        }
        sixButton.setOnClickListener{
            numberStringBuilder.append(6)
            resultTextView.text = numberStringBuilder
        }
        sevenButton.setOnClickListener{
            numberStringBuilder.append(7)
            resultTextView.text = numberStringBuilder
        }
        eightButton.setOnClickListener{
            numberStringBuilder.append(8)
            resultTextView.text = numberStringBuilder
        }
        nineButton.setOnClickListener{
            numberStringBuilder.append(9)
            resultTextView.text = numberStringBuilder
        }
        plusButton.setOnClickListener{
            numberStringBuilder.append("+")
            resultTextView.text = numberStringBuilder
        }
        minusButton.setOnClickListener{
            numberStringBuilder.append("-")
            resultTextView.text = numberStringBuilder
        }
        multiplyButton.setOnClickListener{
            numberStringBuilder.append("*")
            resultTextView.text = numberStringBuilder
        }
        pointButton.setOnClickListener{
            numberStringBuilder.append(".")
            resultTextView.text = numberStringBuilder
        }

    }

}
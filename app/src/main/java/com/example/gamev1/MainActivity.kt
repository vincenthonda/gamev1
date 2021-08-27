package com.example.gamev1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var buttonOne : Button
    lateinit var buttonTwo : Button
    lateinit var buttonThree : Button
    lateinit var textleft : TextView
    lateinit var textright : TextView
    var timesCorrect = 0
    var intOne = -1
    var intTwo = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textleft = findViewById(R.id.textleft)
        buttonThree = findViewById(R.id.button_three)
        buttonTwo = findViewById(R.id.button_two)
        buttonOne = findViewById(R.id.button_one)
        buttonTwo.text = "I'M BIGGER!"
        buttonOne.text = "I'M BIGGER!"
        buttonTwo.setBackgroundColor(Color.DKGRAY)
        buttonOne.setBackgroundColor(Color.LTGRAY)
        buttonThree.setBackgroundColor(Color.TRANSPARENT)

        while(intOne == intTwo) {
            intOne = (Math.random() * 100).toInt()
            intTwo = (Math.random() * 100).toInt()
        }
        buttonOne.text = intOne.toString()
        buttonTwo.text = intTwo.toString()

        buttonOne.setOnClickListener {

                if (intOne > intTwo) {
                    buttonOne.setBackgroundColor(Color.GREEN)
                    buttonThree.setOnClickListener{
                        buttonTwo.setBackgroundColor(Color.DKGRAY)
                        buttonOne.setBackgroundColor(Color.LTGRAY)
                        buttonThree.isClickable = false
                    }
                } else if (intOne > intTwo) {
                    buttonOne.setBackgroundColor(Color.RED)
                    buttonThree.setOnClickListener{
                        buttonTwo.setBackgroundColor(Color.DKGRAY)
                        buttonOne.setBackgroundColor(Color.LTGRAY)
                        buttonThree.isClickable = false
                    }
                }
                intOne = -1
                intTwo = -1
            }

        buttonTwo.setOnClickListener {
                if (intOne > intTwo) {
                    buttonOne.setBackgroundColor(Color.GREEN)
                    buttonThree.setOnClickListener{
                        buttonTwo.setBackgroundColor(Color.DKGRAY)
                        buttonOne.setBackgroundColor(Color.LTGRAY)
                        buttonThree.isClickable = false
                    }
                } else if (intOne > intTwo) {
                    buttonOne.setBackgroundColor(Color.RED)
                    buttonThree.setOnClickListener{
                        buttonTwo.setBackgroundColor(Color.DKGRAY)
                        buttonOne.setBackgroundColor(Color.LTGRAY)
                        buttonThree.isClickable = false
                    }

                }
                intOne = -1
                intTwo = -1
        }


    }
}
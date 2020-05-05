package com.example.lab2
// Abrar T Al-Failakawi #36020

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import org.intellij.lang.annotations.RegExp

class MainActivity : AppCompatActivity() {
    var TAG:String = "MainActivity"
    private var random_number:Int = 0
    private val nums = intArrayOf(0,0,0,0,0,0)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val positiveButtonClick = { dialog: DialogInterface, which: Int ->
            this.finish()
        }
        val textView = findViewById<TextView>(R.id.lbDiceNumber) as TextView
        textView.text = "Dice Number \n"+"Dice 1: 0"+"\n"+"Dice 2: 0"+"\n"+"Dice 3: 0"+"\n"+"Dice 4: 0"+"\n"+"Dice 5: 0"+"\n"+"Dice 6: 0"



        dice_image.setOnClickListener {
            //generate random number
            random_number=(1..6).random()
            when(random_number){
                1 -> {
                    dice_image.setImageResource(R.drawable.dice1)
                    nums[0]+=1
                }
                2 -> {
                    dice_image.setImageResource(R.drawable.dice2)
                    nums[1]+=1
                }
                3 -> {
                    dice_image.setImageResource(R.drawable.dice3)
                    nums[2]+=1
                }
                4 -> {
                    dice_image.setImageResource(R.drawable.dice4)
                    nums[3]+=1
                }
                5 -> {
                    dice_image.setImageResource(R.drawable.dice5)
                    nums[4]+=1
                }
                6 -> {
                    dice_image.setImageResource(R.drawable.dice6)
                    nums[5]+=1
                }




            }
            val textView = findViewById<TextView>(R.id.lbDiceNumber) as TextView
                textView.text = "Dice Number \n"+"Dice 1: "+nums[0]+"\n"+"Dice 2: "+nums[1]+"\n"+"Dice 3: "+nums[2]+"\n"+"Dice 4: "+nums[3]+"\n"+"Dice 5: "+nums[4]+"\n"+"Dice 6: "+nums[5]


            }
        var btn_reset = findViewById<Button>(R.id.btnResetGame)
        btn_reset.setOnClickListener {
            nums[0]=0
            nums[1]=0
            nums[2]=0
            nums[3]=0
            nums[4]=0
            nums[5]=0
                textView.text = "Dice Number \n"+"Dice 1: "+nums[0]+"\n"+"Dice 2: "+nums[1]+"\n"+"Dice 3: "+nums[2]+"\n"+"Dice 4: "+nums[3]+"\n"+"Dice 5: "+nums[4]+"\n"+"Dice 6: "+nums[5]
        }
        var btn_end = findViewById<Button>(R.id.quit)
        btn_end.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("EXIT TO HOME PAGE")
            builder.setMessage("Are you sure you want to stop playing?")
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener(function=positiveButtonClick))
            builder.setNegativeButton(android.R.string.no) { dialog, which ->

            }
            builder.show()
        }
        }

    }


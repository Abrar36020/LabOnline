package com.example.lab2
// Abrar T Al-Failakawi #36020

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val positiveButtonClick = { dialog: DialogInterface, which: Int ->
            this.finish()
        }
        var btn_start = findViewById<Button>(R.id.startGame)
        btn_start.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var btn_end = findViewById<Button>(R.id.endGame)
        btn_end.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("EXIT THE GAME!")
            builder.setMessage("Are you sure you want to quit?")
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener(function=positiveButtonClick))
            builder.setNegativeButton(android.R.string.no) { dialog, which ->

            }
            builder.show()
        }
    }
}

package com.swyat.intervalreminder.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.swyat.intervalreminder.R

class MainActivity : AppCompatActivity() {

    lateinit var bHU : Button
    lateinit var bAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bHU = findViewById<Button>(R.id.bHU)
        bAdd = findViewById<Button>(R.id.bAdd)

        bHU.setOnClickListener{
            val intent = Intent(this, howToUse::class.java)
            startActivity(intent)
        }

        bAdd.setOnClickListener{
            var dialog = dialog()
            dialog.show(supportFragmentManager, "addDialog")
        }
    }
}
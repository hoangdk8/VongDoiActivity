package com.example.vongdoiactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.vongdoiactivity.Fragment1
import com.example.vongdoiactivity.Fragment2

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button_1)
        button2 = findViewById(R.id.button_2)
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout, Fragment1())
                    .commit()
                Toast.makeText(this@MainActivity, "mở fragment", Toast.LENGTH_SHORT).show()
            }

        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_layout, Fragment2())
                    .commit()
                Toast.makeText(this@MainActivity, "mở fragment", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
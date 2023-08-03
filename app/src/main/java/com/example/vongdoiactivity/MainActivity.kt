package com.example.vongdoiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonNext2 : Button
    private lateinit var buttonNext3 : Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private val myLifecycleObserver = MyLifecycleObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNext2 = findViewById(R.id.button_next)
        buttonNext3 = findViewById(R.id.button_3)
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
        buttonNext2.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }
        buttonNext3.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity3::class.java))
        }
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        lifecycle.addObserver(myLifecycleObserver.lifecycleEventObserver)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}
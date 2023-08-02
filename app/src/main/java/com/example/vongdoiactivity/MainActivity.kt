package com.example.vongdoiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button2 : Button
    private lateinit var button3 : Button
    private val myLifecycleObserver = MyLifecycleObserver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_3)
        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }
        button3.setOnClickListener {
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
package com.example.vongdoiactivity

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class MyLifecycleObserver : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreated() {
        // Xử lý khi LifecycleOwner được tạo (ví dụ: khởi tạo dữ liệu, tài nguyên, v.v.)
        println("LifecycleOwner is created.")
    }

    var lifecycleEventObserver = LifecycleEventObserver { _, event ->
        when (event) {
            Lifecycle.Event.ON_RESUME -> {
                Log.d("Hoang", ":ON_RESUME ")
            }
            Lifecycle.Event.ON_CREATE -> {
                Log.d("Hoang", ":ON_CREATE ")
            }
            Lifecycle.Event.ON_START -> {
                Log.d("Hoang", ":ON_START ")
            }
            Lifecycle.Event.ON_PAUSE -> {
                Log.d("Hoang", ":ON_PAUSE ")
            }
            Lifecycle.Event.ON_STOP -> {
                Log.d("Hoang", ":ON_STOP ")
            }
            Lifecycle.Event.ON_DESTROY -> {
                Log.d("Hoang", ":ON_DESTROY ")
            }
            else -> {}
        }
    }
}
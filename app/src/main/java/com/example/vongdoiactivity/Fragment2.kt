package com.example.vongdoiactivity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment2 : Fragment(R.layout.fragment_2) {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d("hoang", "onCreate2")
        }

        override fun onStart() {
            super.onStart()
            Log.d("hoang", "onStart2")
        }

        override fun onResume() {
            super.onResume()
            Log.d("hoang", "onResume2")
        }

        override fun onPause() {
            super.onPause()
            Log.d("hoang", "onPause2")
        }

        override fun onStop() {
            super.onStop()
            Log.d("hoang", "onStop2")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.d("hoang", "onDestroyView2")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("hoang", "onDestroy2")
        }

        override fun onDetach() {
            super.onDetach()
            Log.d("hoang", "onDetach2")
        }

        
    }
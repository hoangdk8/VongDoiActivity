package com.example.vongdoiactivity

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("hoang", "onAttach1")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        val button1 : Button = view.findViewById(R.id.button_1)
        button1.setOnClickListener {
            Toast.makeText(requireActivity(), "Đây là fragment 1", Toast.LENGTH_SHORT).show()
        }
        return view
        Log.d("hoang", "onCreateView1")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("hoang", "onActivityCreated1")
    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d("hoang", "onCreate1")
        }

        override fun onStart() {
            super.onStart()
            Log.d("hoang", "onStart1")
        }

        override fun onResume() {
            super.onResume()
            Log.d("hoang", "onResume1")
        }

        override fun onPause() {
            super.onPause()
            Log.d("hoang", "onPause1")
        }

        override fun onStop() {
            super.onStop()
            Log.d("hoang", "onStop1")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.d("hoang", "onDestroyView1")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("hoang", "onDestroy1")
        }

        override fun onDetach() {
            super.onDetach()
            Log.d("hoang", "onDetach1")
        }

        
    }
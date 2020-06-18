package com.example.adb9week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zipCodeEditText: EditText = findViewById(R.id.editText)
        val submitButton: Button = findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
            var zipcode: String =editText.text.toString()
            if (zipcode.length !=5) {
                Toast.makeText(this,"Invalid zipcode", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, zipcode, Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
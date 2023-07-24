package com.ryan.belajarandroiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        private lateinit var nameEditText: EditText
        private lateinit var sayHelloButton: Button
        private lateinit var sayHelloTextView: TextView

        private fun initComponent() {
            nameEditText = findViewById(R.id.nameEditText)
            sayHelloButton = findViewById(R.id.sayHelloButton)
            sayHelloTextView = findViewById(R.id.sayHelloTextView)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView((R.layout.hello_world))

            initComponent()

            sayHelloTextView.text = "Hi"

            sayHelloButton.setOnClickListener {
                val name = nameEditText.text.toString()
                sayHelloTextView.text = "Hi $name"
            }
        }
    }
package com.ryan.belajarandroiddasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
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

            sayHelloTextView.text = resources.getString(R.string.app_name)

            sayHelloButton.setOnClickListener {

                Log.d("PZN", "This is debug Log")
                Log.i("PZN", "This is Info Log")
                Log.w("PZN", "This is Warnig Log")
                Log.e("PZN", "This is error Log")

                val name = nameEditText.text.toString()
                sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

                resources.getStringArray(R.array.names).forEach {
                    Log.i("PZN", it)
                }
            }
        }
    }
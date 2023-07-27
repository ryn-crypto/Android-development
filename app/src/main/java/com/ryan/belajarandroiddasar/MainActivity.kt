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

//                val  json = assets.open("sample.json")
//                    .bufferedReader()
//                    .use { it.readText() }
//                Log.i("Asset", json)

                val json = resources.openRawResource(R.raw.sample)
                    .bufferedReader()
                    .use { it.readText() }

                Log.i("Asset",json)

                Log.d("PZN", "This is debug Log")
                Log.i("PZN", "This is Info Log")
                Log.w("PZN", "This is Warning Log")
                Log.e("PZN", "This is error Log")

                Log.i("ValueResources", resources.getInteger(R.integer.maxPage).toString())
                Log.i("ValueResources", resources.getBoolean(R.bool.isProductionMode).toString())
                Log.i("ValueResources", resources.getIntArray(R.array.number).joinToString(","))
                Log.i("ValueResources", resources.getColor(R.color.background, theme).toString())

                sayHelloButton.setBackgroundColor(resources.getColor(R.color.background, theme))

                val name = nameEditText.text.toString()
                sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

                resources.getStringArray(R.array.names).forEach {
                    Log.i("PZN", it)
                }
            }
        }
    }
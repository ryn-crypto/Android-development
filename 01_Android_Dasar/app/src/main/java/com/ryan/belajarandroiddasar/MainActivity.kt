package com.ryan.belajarandroiddasar

import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    private fun checkFingerprint() {
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
            Log.i("FEATURE", "Finggerprint ON")
        } else {
            Log.w("FEATURE", "Finggerprint OFF")
        }
    }

    private fun checkPlatformVersion() {
        Log.i("SDK", Build.VERSION.SDK_INT.toString())
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
          Log.i("SDK", "Disable feature, Because version sdk is lower than 31")
        } else {
            Log.i("SDK", "Feature active")
        }
    }

    private fun printHello(name: String) {
        Log.i("DEBUG", name)
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

                printHello("Ryan")
                printHello("Joko")

                checkFingerprint()
                checkPlatformVersion()

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
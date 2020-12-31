package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//Android Developers -> Localize your app
//app trilíngue
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a string resource from your app's Resources
        val hello = resources.getString(R.string.hello_world)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = hello
    }
}
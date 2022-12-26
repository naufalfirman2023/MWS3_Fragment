package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnFragment_1: Button
    lateinit var btnFragment_2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment_1 = findViewById(R.id.fragment1)
        btnFragment_2 = findViewById(R.id.fragment2)

        btnFragment_1.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.fragmentlayout,Fragment1())
            fr.commit()
        }
        btnFragment_2.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.fragmentlayout,Fragment2())
            fr.commit()
        }

        var  fr = supportFragmentManager.beginTransaction()
        fr.add(R.id.fragmentlayout,Fragment1())
        fr.commit()
    }
}



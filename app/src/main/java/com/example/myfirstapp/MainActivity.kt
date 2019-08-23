package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //Written by David Zhang  用来控制灌溉
    override fun onCreate(savedInstanceState: Bundle?) {
        //集成父类
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

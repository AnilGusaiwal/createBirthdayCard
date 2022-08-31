package com.example.createbirthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdayButton(view: View) {
         var name =R.string.name;
        Toast.makeText(this,R.string.app_name,Toast.LENGTH_LONG).show();

    }
}
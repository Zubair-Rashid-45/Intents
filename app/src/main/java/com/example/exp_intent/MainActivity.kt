package com.example.exp_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main)

        val buttonLight=findViewById<Button>(R.id.BtnLight)
        val buttonDark= findViewById<Button>(R.id.BtnDark)
        val buttonLogin=findViewById<Button>(R.id.BtnLogin)
        val Layout = findViewById<ScrollView>(R.id.scrollView)



        buttonLight.setOnClickListener {
            Layout.setBackgroundResource(R.color.cyan)
            Toast.makeText(applicationContext, "Light Theme Activated", Toast.LENGTH_SHORT).show()
        }

        buttonDark.setOnClickListener {
            Layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext, "Light Theme Activated", Toast.LENGTH_SHORT).show()
        }



        buttonLogin.setOnClickListener {
            //open a new Activity..
            intent = Intent(applicationContext, Profile::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Going to Profile", Toast.LENGTH_LONG).show()
        }


    }

}
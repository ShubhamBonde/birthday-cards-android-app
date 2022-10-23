package com.shubham.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//MainActivate -> Normal class extended by AppCompatActivity()
// fun OnCreate Method is lifecycle method there are multiple such lifecycle methods

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val createButton = findViewById(R.id.createBirthdayCard) as Button // sort of like getElementById
//
//        createButton.setOnClickListener {
//            Toast.makeText(this@MainActivity, "you clicked button", Toast.LENGTH_SHORT).show()
//        }
    }

    fun createCard(view: View) {
        // to be implemented
//        val userNameIp = findViewById<EditText>(R.id.userNameInput) // kinda like querySelector or getElementById
//        val name = userNameIp.editableText.toString()
//        Toast.makeText(this@MainActivity, "Happy Birthday $name",
//            Toast.LENGTH_SHORT).show()
        val input = findViewById<EditText>(R.id.userNameInput)
        val name = input.editableText.toString()
        val intent = Intent(this,  birthday_greeting::class.java)
        intent.putExtra(birthday_greeting.NAME_EXTRA, name)
        startActivity(intent)
    }
}
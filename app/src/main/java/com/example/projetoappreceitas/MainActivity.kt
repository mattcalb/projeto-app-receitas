package com.example.projetoappreceitas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.login_button)
        val emailInput = findViewById<EditText>(R.id.email)
        val passwordInput = findViewById<EditText>(R.id.password)
        loginButton.setOnClickListener {
            if (emailInput.text.toString().equals("user@gmail.com") &&
                passwordInput.text.toString().equals("1234")) {
                Toast.makeText(this, "Logado com sucesso!", Toast.LENGTH_LONG).show()
                val intent = Intent(applicationContext, Home::class.java)
                startActivity(intent)
            }
        }
    }
}
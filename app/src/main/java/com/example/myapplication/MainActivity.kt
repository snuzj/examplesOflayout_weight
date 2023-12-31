package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exitBtn.setOnClickListener {
            finish()
        }

        binding.helloBtn.setOnClickListener {
            Toast.makeText(this, "xin chào các bạn", Toast.LENGTH_SHORT).show()
        }

        binding.exampleBtn.setOnClickListener {
            startActivity(Intent(this, ListExamplesActivity::class.java))
        }
    }
}
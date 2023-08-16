package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityListExamplesBinding
import com.example.myapplication.listexamples.EighthExampleActivity
import com.example.myapplication.listexamples.FifthExampleActivity
import com.example.myapplication.listexamples.FirstExampleActivity
import com.example.myapplication.listexamples.FourthExampleActivity
import com.example.myapplication.listexamples.NinethExampleActivity
import com.example.myapplication.listexamples.SecondExampleActivity
import com.example.myapplication.listexamples.SeventhExampleActivity
import com.example.myapplication.listexamples.SixthExampleActivity
import com.example.myapplication.listexamples.TenthExampleActivity
import com.example.myapplication.listexamples.ThirdExampleActivity

@Suppress("DEPRECATION")
class ListExamplesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListExamplesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListExamplesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            onBackPressed()
        }

        binding.exp1Btn.setOnClickListener {
            startActivity(Intent(this, FirstExampleActivity::class.java))
        }

        binding.exp2Btn.setOnClickListener {
            startActivity(Intent(this, SecondExampleActivity::class.java))
        }

        binding.exp3Btn.setOnClickListener {
            startActivity(Intent(this, ThirdExampleActivity::class.java))
        }

        binding.exp4Btn.setOnClickListener {
            startActivity(Intent(this,FourthExampleActivity::class.java))
        }

        binding.exp5Btn.setOnClickListener {
            startActivity(Intent(this, FifthExampleActivity::class.java))
        }

        binding.exp6Btn.setOnClickListener {
            startActivity(Intent(this, SixthExampleActivity::class.java))
        }

        binding.exp7Btn.setOnClickListener {
            startActivity(Intent(this, SeventhExampleActivity::class.java))
        }

        binding.exp8Btn.setOnClickListener {
            startActivity(Intent(this, EighthExampleActivity::class.java))
        }

        binding.exp9Btn.setOnClickListener {
            startActivity(Intent(this, NinethExampleActivity::class.java))
        }

        binding.exp10Btn.setOnClickListener {
            startActivity(Intent(this, TenthExampleActivity::class.java))
        }

    }
}
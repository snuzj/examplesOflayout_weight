package com.example.myapplication.listexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityNinethExampleBinding

class NinethExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNinethExampleBinding
    private var isMainLlVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNinethExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

        binding.toggleButton.setOnClickListener {
            isMainLlVisible = !isMainLlVisible
            toggleMainLlVisibility()
        }
    }

    private fun toggleMainLlVisibility() {
        val slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        val slideOutAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_out)

        if (!isMainLlVisible) {
            binding.toggleButton.text = "Trước tùy chỉnh"
            binding.toggleButton.setBackgroundColor(getColor(R.color.primary_color))
            binding.mainLl.startAnimation(slideInAnimation)
            binding.mainLl.visibility = View.VISIBLE
            binding.subLl.visibility = View.GONE
        } else {
            binding.toggleButton.text = "Sau tùy chỉnh"
            binding.toggleButton.setBackgroundColor(getColor(R.color.secondary_color))
            binding.mainLl.startAnimation(slideOutAnimation)
            binding.mainLl.visibility = View.GONE
            binding.subLl.visibility = View.VISIBLE
        }
    }
}
package com.example.hw63

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw63.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        logic()
    }

    private fun logic() {
        val met = intent.getStringExtra("key")
        binding.textTv.text = met
    }
}
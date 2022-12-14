package com.example.appsumin5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appsumin5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.button1.setOnClickListener{
            val text = binding.editText1.text
            binding.textView1.text = text
        }

    }
}
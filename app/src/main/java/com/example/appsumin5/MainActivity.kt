package com.example.appsumin5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.appsumin5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.button1.setOnClickListener{ // button
            val text = binding.editText1.text
            binding.textView1.text = text
        }

    }
    override fun onCreateOptionsMenu(menu : Menu) :Boolean{
        menuInflater.inflate(R.menu.menu_toolbar1, menu)
        return true
    }

    override fun onOptionsItemSelected(item : MenuItem) : Boolean{
        when(item.itemId){
            android.R.id.home ->{finish()}
            R.id.button_edit_toolbar ->{Toast.makeText(this,"edit",Toast.LENGTH_SHORT).show()}
            R.id.button_info_toolbar ->{Toast.makeText(this,"info",Toast.LENGTH_SHORT).show()}
            R.id.button_works_toolbar ->{Toast.makeText(this,"works",Toast.LENGTH_SHORT).show()}
        }
        return true
    }
}
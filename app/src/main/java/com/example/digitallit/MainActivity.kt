package com.example.digitallit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.digitallit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cv1.setOnClickListener{
            intent = Intent(this@MainActivity, information::class.java)
            startActivity(intent)
        }

        binding.cv2.setOnClickListener{
            intent = Intent(this@MainActivity, creation::class.java)
            startActivity(intent)
        }

        binding.cv3.setOnClickListener {
            intent = Intent(this@MainActivity, teaching::class.java)
            startActivity(intent)
        }

        binding.cv4.setOnClickListener {
            intent = Intent(this@MainActivity, technical::class.java)
            startActivity(intent)
        }

        binding.cv5.setOnClickListener {
            intent = Intent(this@MainActivity, communication::class.java)
            startActivity(intent)
        }

        binding.cv6.setOnClickListener {
            intent = Intent(this@MainActivity, security::class.java)
            startActivity(intent)
        }
    }
}
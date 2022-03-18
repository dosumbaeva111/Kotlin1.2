package com.example.kotlin12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.kotlin12.databinding.ActivityMainBinding
import com.example.kotlin12.extensions.loadImage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listImage = arrayListOf(
        "https://i.imgur.com/9aJjw9T.jpeg",
        "https://i.imgur.com/9aJjw9T.jpeg",
        "https://i.imgur.com/eHOZDzm.jpeg",
        "https://i.imgur.com/D1WbkcD.png",
        "https://i.imgur.com/Pgy1eRJ.jpeg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRandom.setOnClickListener{
            binding.imgRandom.loadImage(listImage.random())
        }
        binding.btnAdd.setOnClickListener{
            listImage.add(binding.etTypeUrl.text.toString())
        }
    }

}
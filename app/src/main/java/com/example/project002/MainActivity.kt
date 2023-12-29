package com.example.project002

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.project002.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            redbtn.setOnClickListener(this@MainActivity)
            blackbtn.setOnClickListener(this@MainActivity)
            bluebtn.setOnClickListener(this@MainActivity)
            yellowbtn.setOnClickListener(this@MainActivity)
            greenbtn.setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(view: View?) {

           val n =view?.tag
        val media=MediaPlayer.create(
            this,
            resources.getIdentifier("$n","raw",packageName)
        )
        media.start()

        }

    }

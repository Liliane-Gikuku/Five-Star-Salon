package com.example.fivestarsalon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fivestarsalon.databinding.ActivityBoardTwoBinding

class BoardTwo : AppCompatActivity() {
    lateinit var binding: ActivityBoardTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoardTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()

    }
    fun castViews(){
        binding.btnServices.setOnClickListener{
            var intent= Intent(this,BoardThree::class.java)
            startActivity(intent)
        }

    }
}


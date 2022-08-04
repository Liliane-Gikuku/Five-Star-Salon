package com.example.fivestarsalon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.fivestarsalon.databinding.ActivityBoardThreeBinding

class BoardThree : AppCompatActivity() {
    lateinit var binding: ActivityBoardThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoardThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
    }
    fun castViews(){
        binding.btnStart.setOnClickListener{
            var intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

    }
}
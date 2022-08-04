package com.example.fivestarsalon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fivestarsalon.databinding.ActivityBoardOneBinding

class BoardOne : AppCompatActivity() {
    lateinit var binding: ActivityBoardOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBoardOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
    }
    fun castViews(){
        binding.btnExplore.setOnClickListener{
            var intent= Intent(this,BoardTwo::class.java)
            startActivity(intent)
        }

    }
}
package com.example.salitalaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.salitalaan.databinding.ActivityDetailBinding
class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            onBackPressed()
        }
        var title : String? = intent.getStringExtra("title")
        var code : String? = intent.getStringExtra("code")

        binding.tvTitle.text = title
        binding.tvCode.text = code
    }
}
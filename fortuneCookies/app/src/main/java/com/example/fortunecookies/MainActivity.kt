package com.example.fortunecookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fortunecookies.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button2.setOnClickListener {
            val intentb = Intent(this,Settings::class.java)
            startActivity(intentb)
        }

        button3.setOnClickListener {
            val intentc = Intent(this,todaysFortune::class.java)
            startActivity(intentc)
        }

    }
}
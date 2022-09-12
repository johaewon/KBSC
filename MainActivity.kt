package com.example.kbsc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kbsc.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_fortune_cookies2.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*val intenta = Intent(this, FortuneCookies::class.java)
        binding.button1.setOnClickListener {
            binding.button1.setOnClickListener { startActivity(intenta)}
        }*/
        button1.setOnClickListener {
            val intenta = Intent(this,FortuneCookies::class.java)
            startActivity(intenta)
        }

        button2.setOnClickListener {
            val intentb = Intent(this,FortuneCookies2::class.java)
            startActivity(intentb)
        }

        button3.setOnClickListener {
            val intentc = Intent(this,Settings::class.java)
            startActivity(intentc)
        }


    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //View에 이벤트 리스너 설정하는 법
        //fortunecookies
        findViewById<View>(R.id.button1).setOnClickListener {
            val intent = Intent(this@MainActivity, FortuneCookies::class.java)
            startActivity(intent)
        }

        //fortunecookies2
        findViewById<View>(R.id.button2).setOnClickListener {
            val intent = Intent(this@MainActivity, FortuneCookies2::class.java)
            startActivity(intent)}

        //settings
        findViewById<View>(R.id.button3).setOnClickListener {
            val intent = Intent(this@MainActivity, Settings::class.java)
            startActivity(intent)
        }

    }*/
}
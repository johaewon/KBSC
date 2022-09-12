package com.example.kbsc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kbsc.databinding.ActivitySettingsBinding
import kotlinx.android.synthetic.main.activity_fortune_cookies2.*
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {

    val binding by lazy {ActivitySettingsBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*val intent1 = Intent(this, InputImage::class.java)
        binding.buttonProfile.setOnClickListener {
            binding.buttonProfile.setOnClickListener { startActivity(intent1)}
        }*/
        button_profile.setOnClickListener {
            val intent1 = Intent(this,InputImage::class.java)
            startActivity(intent1)
        }

        button_name.setOnClickListener {
            val intent2 = Intent(this,InputName::class.java)
            startActivity(intent2)
        }

        button_birth.setOnClickListener {
            val intent3 = Intent(this,InputBirth::class.java)
            startActivity(intent3)
        }


    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        //View에 이벤트 리스너 설정하는 법
        //InputImage
        findViewById<View>(R.id.button_profile).setOnClickListener {
            val intent = Intent(this@Settings, InputImage::class.java)
            startActivity(intent)
        }

        //InputName
        findViewById<View>(R.id.button_name).setOnClickListener {
            val intent = Intent(this@Settings, InputName::class.java)
            startActivity(intent)
        }

        //InputBirth
        findViewById<View>(R.id.button_birth).setOnClickListener {
            val intent = Intent(this@Settings, InputBirth::class.java)
            startActivity(intent)
        }
    }*/


}

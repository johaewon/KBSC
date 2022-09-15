package com.example.fortunecookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fortunecookies.databinding.ActivitySettingsBinding
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {

    val binding by lazy { ActivitySettingsBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        button_profile.setOnClickListener {
            val intent1 = Intent(this,InputImages::class.java)
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
}
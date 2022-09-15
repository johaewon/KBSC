package com.example.fortunecookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.view.View
import com.example.fortunecookies.databinding.ActivityInputImagesBinding
import kotlinx.android.synthetic.main.activity_input_images.*

class InputImages : AppCompatActivity() {

    val binding by lazy { ActivityInputImagesBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_images)

        buttonGallery.setOnClickListener {
            val intenta = Intent(this,SelectImage::class.java)
            startActivity(intenta)
        }

        //val profile = intent.getStringExtra("profile")?.toInt()

        /*when {
            "profile" = "1" -> imagePreview.setImageResource(R.drawable.profile1)
            profile = 2 -> imagePreview.setImageResource(R.drawable.profile2)
        }*/

    }
}

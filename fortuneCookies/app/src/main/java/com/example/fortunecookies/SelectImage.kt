package com.example.fortunecookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fortunecookies.databinding.ActivityMainBinding
import com.example.fortunecookies.databinding.ActivitySelectImageBinding
import kotlinx.android.synthetic.main.activity_input_name.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_image.*

class SelectImage : AppCompatActivity() {

    val binding by lazy { ActivitySelectImageBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_image)

        loadData()

        ResultProfile.setOnClickListener{
            /*val intent = Intent(this, InputImages::class.java)
            intent.putExtra("profile", editTextProfile.text.toString())
            startActivity(intent)*/

            saveData()
            Toast.makeText(this, "사진이 변경되었습니다.", Toast.LENGTH_SHORT).show()
        }

    }
    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        editTextProfile.setText(pref.getString("profile",""))
    }
    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()
        edit.putString("profile",editTextName.text.toString())
        edit.apply()
    }
}
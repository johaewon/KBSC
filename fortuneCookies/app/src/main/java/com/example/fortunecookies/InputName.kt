package com.example.fortunecookies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_input_name.*

class InputName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_name)

        loadData()

        ResultName.setOnClickListener{
            saveData()
            Toast.makeText(this, "이름이 저장되었습니다.", Toast.LENGTH_SHORT).show()
        }

    }

    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        editTextName.setText(pref.getString("name",""))
    }



    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()
        edit.putString("name",editTextName.text.toString())
        edit.apply()
    }

}
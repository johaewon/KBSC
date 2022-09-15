package com.example.fortunecookies

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_input_birth.*
import kotlinx.android.synthetic.main.activity_input_name.*
import java.util.*


private val DatePicker.text: Any
    get() = Unit

class InputBirth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_birth)

        
        //이전에 입력한 값 읽어오기
        loadData()

        ResultBirth.setOnClickListener{
            //intent에 데이터 담아두기
            /*val intent = Intent(this,InputBirth::class.java)
            intent.putExtra("birth",datePicker.toString())
            startActivity(intent)*/

            saveData(datePicker.toString())
            Toast.makeText(this, "생년월일이 저장되었습니다.", Toast.LENGTH_SHORT).show()
        }

    }

    private fun loadData() {
        //intent에서 데이터 꺼내기
        //val birth = intent.getStringExtra("birth")

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val birth = pref.getString("KEY_BIRTH", null)

        datePicker.toString()
    }

    private fun saveData(birth: String) {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("KEY_BIRTH",birth)
            .apply()

    }

}

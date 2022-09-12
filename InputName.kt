package com.example.kbsc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.renderscript.ScriptGroup
import android.view.View
import android.view.View.inflate
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.kbsc.databinding.ActivityInputNameBinding
import kotlinx.android.synthetic.main.activity_input_name.*
import java.util.prefs.Preferences

//import kotlinx.android.synthetic.main.activity_input_name.*
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_settings.*

class InputName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_name)

        //이전에 입력한 값 읽어오기
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

    /*override fun onDestroy() {
        super.onDestroy()

        saveData()
    }*/

    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()
        edit.putString("name",editTextName.text.toString())
        edit.apply()
    }


}
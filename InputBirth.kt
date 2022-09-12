package com.example.kbsc

import android.app.DatePickerDialog
import android.icu.text.DateFormat.MONTH
import android.icu.text.DateFormat.YEAR
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_input_birth.*
import kotlinx.android.synthetic.main.activity_input_name.*
import java.text.DateFormat.Field.DAY_OF_MONTH
import java.text.DateFormat.Field.MONTH

//import kotlinx.android.synthetic.main.activity_main.*

private val DatePicker.text: Any
    get() = Unit

class InputBirth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_birth)

        /*
        //이전에 입력한 값 읽어오기
        loadData()*/

        ResultBirth.setOnClickListener{
            //saveData()
            Toast.makeText(this, "생년월일이 저장되었습니다.", Toast.LENGTH_SHORT).show()
        }

        /*val ResultBirth = findViewById<Button>(R.id.ResultBirth)
        val textView     = findViewById<DatePicker>(R.id.datePicker)

        val c = DatePicker.getSharedPreferences("pref",0)
        val year = c.get(DatePicker.year)
        val month = c.get(DatePicker.monthOfYear)
        val day = c.get(DatePicker.dayOfMonth)

        ResultBirth.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                textView.setText("" + dayOfMonth + " " + month + ", " + year)
            }, year, month, day)
            dpd.show()

        }*/
    }

    /*private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        datePicker.text(pref.getString("birth",""))
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val birthFromUser = "${year.value}${np2.value}${np3.value}"

        birthFromUser.edit(true) {
            purString("birth", birthFromUser)
        }

        val edit = pref.edit()
        edit.putString("birth",datePicker.text.toString())
        edit.apply()
    }*/

}






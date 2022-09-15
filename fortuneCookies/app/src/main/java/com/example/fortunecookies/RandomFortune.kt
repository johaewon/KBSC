package com.example.fortunecookies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fortunecookies.databinding.ActivityRandomFortuneBinding

class RandomFortune : AppCompatActivity() {

    private val binding by lazy { ActivityRandomFortuneBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            toolbar.setNavigationOnClickListener { onBackPressed() } //이거는 위에 뒤로가기 화살표 생기는거. 이 줄 지운다고 문제되진 않음
            resultTextView.text = resources.getStringArray(R.array.fortune_results).random() //이게 랜덤으로 문장 뽑아오는거
        }
    }
}
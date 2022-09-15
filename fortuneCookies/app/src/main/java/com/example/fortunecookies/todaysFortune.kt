package com.example.fortunecookies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.updateLayoutParams
import com.example.fortunecookies.databinding.ActivityTodaysFortuneBinding

class todaysFortune : AppCompatActivity(), View.OnClickListener {

    private val binding by lazy { ActivityTodaysFortuneBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 하트 아이콘 사이즈를 핸드폰의 폭에 맞게 조절하기 위한 코드
        val space = 36 * 4 * resources.displayMetrics.density
        val fortuneWidth = ((resources.displayMetrics.widthPixels - space) / 3).toInt()


        with(binding) {
            fortune1Button.setOnClickListener(this@todaysFortune)
            fortune2Button.setOnClickListener(this@todaysFortune)
            fortune3Button.setOnClickListener(this@todaysFortune)
            fortune4Button.setOnClickListener(this@todaysFortune)
            fortune5Button.setOnClickListener(this@todaysFortune)

            fortune1Button.updateLayoutParams<LinearLayout.LayoutParams> {
                width = fortuneWidth
                height = fortuneWidth
            }

            fortune2Button.updateLayoutParams<LinearLayout.LayoutParams> {
                width = fortuneWidth
                height = fortuneWidth
            }

            fortune3Button.updateLayoutParams<LinearLayout.LayoutParams> {
                width = fortuneWidth
                height = fortuneWidth
            }

            fortune4Button.updateLayoutParams<LinearLayout.LayoutParams> {
                width = fortuneWidth
                height = fortuneWidth
            }

            fortune5Button.updateLayoutParams<LinearLayout.LayoutParams> {
                width = fortuneWidth
                height = fortuneWidth
            }
        }

    }

    override fun onClick(v: View?) {
        startActivity(Intent(this, RandomFortune::class.java).apply {
            flags = flags or Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP
        })
    }
}
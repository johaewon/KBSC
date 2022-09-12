package com.example.kbsc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kbsc.databinding.ActivityFortuneCookies2Binding
import kotlinx.android.synthetic.main.activity_fortune_cookies2.*

class FortuneCookies2 : AppCompatActivity() {

    val binding by lazy { ActivityFortuneCookies2Binding.inflate(layoutInflater)}
    //val mFortuneBook = FortuneBook()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*val intentA = Intent(this, RandomText::class.java)
        binding.clickFortune1.setOnClickListener {
            binding.clickFortune1.setOnClickListener { startActivity(intentA)}
        }*/
        clickFortune1.setOnClickListener {
            val intentA = Intent(this,RandomText::class.java)
            startActivity(intentA)
        }

        clickFortune2.setOnClickListener {
            val intentB = Intent(this,RandomText::class.java)
            startActivity(intentB)
        }

        clickFortune3.setOnClickListener {
            val intentC = Intent(this,RandomText::class.java)
            startActivity(intentC)
        }

        clickFortune4.setOnClickListener {
            val intentD = Intent(this,RandomText::class.java)
            startActivity(intentD)
        }

        clickFortune5.setOnClickListener {
            val intentE = Intent(this,RandomText::class.java)
            startActivity(intentE)
        }


        /*
        // Declare our View variables and assign teh Views from our layout file
        val factlabel = findViewById<View>(R.id.factTextView) as TextView
        val showFactButton = findViewById<View>(R.id.showFactButton) as Button
        val mLayout = findViewById<View>(R.id.LinearLayout) as RelativeLayout*/

    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fortune_cookies2)


        //View에 이벤트 리스너 설정하는 법
        //RandomText
        findViewById<View>(R.id.clickFortune1).setOnClickListener {
            val intent = Intent(this@FortuneCookies2, RandomText::class.java)
            startActivity(intent)
        }
    }*/
}
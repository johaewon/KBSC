package com.example.kbsc

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class RandomText : AppCompatActivity() {

    //private val fortuneList = ArrayList<Bitmap>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_text)


        /*for( i in 0..6 )
        {
            val bmp : Int = getResources().getIdentifier("fortune" + (i + 1), "drawable", packageName )
            val bitmap:Bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), bmp),
                70,70, false)
            fortuneList.add(bitmap)
        }

        val btn : Button = findViewById<Button>(R.id.click)

        btn.setOnClickListener{

            val set: TreeSet<Int> = TreeSet()

            while(set.size < 6) {
                val random = java.util.Random()
                val num = random.nextInt(7)
                set.add(num)
            }

            for((nCount, i) in set.withIndex())
            {
                val tmpID : Int =  getResources().getIdentifier("fortuneView" + (nCount + 1),
                    "id", packageName )
                val imgView = findViewById<ImageView>(tmpID)
                imgView.setImageBitmap(fortuneList.get(i))
            }

        }*/
    }
}


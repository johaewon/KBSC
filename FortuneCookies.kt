package com.example.kbsc

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class FortuneCookies : AppCompatActivity() {

    private val fortuneList = ArrayList<Bitmap>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fortune_cookies)
        //Toast.makeText(applicationContext, "", Toast.LENGTH_LONG).show()

        Toast.makeText(this@FortuneCookies, "Create today's fortune", Toast.LENGTH_SHORT).show()
        for( i in 0..6)
        {
            var bmp : Int = resources.getIdentifier("fortune" + (i + 1), "drawable", packageName )
            var bitmap:Bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, bmp),
                70,70, false)
            fortuneList.add(bitmap)
        }

        val btn : Button = findViewById<Button>(R.id.click)

        btn.setOnClickListener{
            Toast.makeText(this@FortuneCookies, "button start.", Toast.LENGTH_SHORT).show()

            val set: TreeSet<Int> = TreeSet()

            while(set.size < 1) {
                val random = Random()
                val num = random.nextInt(7)
                set.add(num)
            }

            Toast.makeText(this@FortuneCookies, "fortune check.", Toast.LENGTH_SHORT).show()

            for((nCount, i) in set.withIndex())
            {
                var tmpID : Int =  resources.getIdentifier("fortuneView" + (nCount + 1),
                    "id", packageName )
                val imgView = findViewById<ImageView>(tmpID)
                imgView.setImageBitmap(fortuneList[i])
            }

            Toast.makeText(this@FortuneCookies, "button end.", Toast.LENGTH_SHORT).show()


            /*for((nCount, i) in set.withIndex())
            {
                val tmpID : Int =  getResources().getIdentifier("fortuneView" + (nCount + 1),
                    "id", packageName )
                val imgView = findViewById<ImageView>(tmpID)
                imgView.setImageBitmap(fortuneList.get(i))
            }*/
    }
}
}
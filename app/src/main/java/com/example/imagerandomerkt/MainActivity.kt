package com.example.imagerandomerkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val imageArrays = mutableListOf(
        "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg",
        "https://girlup.imgix.net/2020/01/Home_Resized-2.jpg",
        "https://api.time.com/wp-content/uploads/2014/11/andromedagalaxy.jpg",
        "https://www.metropropsa.com.au/images/knock-down-rebuild/knock-down-rebuild-home.jpg",
        "https://media.timeout.com/images/105645687/image.jpg"
    )


    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        add_btn.setOnClickListener{
            addImages(imageArrays,url_et.text.toString())
        }
        random_btn.setOnClickListener {
            val random = Random()
            val randomNumber = random.nextInt(imageArrays.size)
            random_iv.loadImage(imageArrays.elementAt(randomNumber))
        }

        clear_btn.setOnClickListener {
            url_et.text.clear()
        }
    }


}
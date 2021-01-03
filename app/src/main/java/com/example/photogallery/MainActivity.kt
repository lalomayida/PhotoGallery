package com.example.photogallery

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToImage1(view: View){
        val imageIntent = Intent(this, image1::class.java)
        startActivity(imageIntent)
    }
    fun goToImage2(view: View){
        val imageIntent = Intent(this, image2::class.java)
        startActivity(imageIntent)
    }
    fun goToImage3(view: View){
        val imageIntent = Intent(this, image3::class.java)
        startActivity(imageIntent)
    }
    fun goToImage4(view: View){
        val imageIntent = Intent(this, image4::class.java)
        startActivity(imageIntent)
    }
    fun goToImage5(view: View){
        val imageIntent = Intent(this, image5::class.java)
        startActivity(imageIntent)
    }
    fun goToImage6(view: View){
        val imageIntent = Intent(this, image6::class.java)
        startActivity(imageIntent)
    }
    fun goToImage7(view: View){
        val imageIntent = Intent(this, image7::class.java)
        startActivity(imageIntent)
    }
    fun goToImage8(view: View){
        val imageIntent = Intent(this, image8::class.java)
        startActivity(imageIntent)
    }
}
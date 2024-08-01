package com.luckzone.luckzone.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luckzone.luckzone.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickCategories(v: View) {
        startActivity(Intent(this, CategoriesActivity::class.java))
    }

    fun onClickAnnouncement(v: View) {
        startActivity(Intent(this, AnnouncementActivity::class.java))
    }
}
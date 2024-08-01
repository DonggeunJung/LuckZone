package com.luckzone.luckzone.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luckzone.luckzone.R

class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
    }

    fun onClickProducts(v: View) {
        startActivity(Intent(this, PaymentMethodsActivity::class.java))
    }
}
package com.lukman.sistempakar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class TentangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)
        supportActionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this@TentangActivity, R.color.yellow_2)
    }
}
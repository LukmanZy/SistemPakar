package com.lukman.sistempakar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mulaiBtn: CardView
    private lateinit var tentangBtn: CardView

    private fun iniComponent(){
        mulaiBtn = findViewById(R.id.mulaiBtn)
        tentangBtn = findViewById(R.id.tentangBtn)
    }

    private fun touch(){
        mulaiBtn.setOnClickListener(this)
        tentangBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.mulaiBtn -> {
                    val DiagnosaView = Intent(this@MainActivity, DiagnosaActivity::class.java)
                    startActivity(DiagnosaView)
                }
                R.id.tentangBtn -> {
                    val TentangVieew = Intent(this@MainActivity,TentangActivity::class.java)
                    startActivity(TentangVieew)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.teal_700)
        iniComponent()
        touch()
    }

}
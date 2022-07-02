package com.lukman.sistempakar

import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.lukman.sistempakar.helper.showDialog

class DiagnosaActivity : AppCompatActivity() {

    private lateinit var checkbox1: CheckBox
    private lateinit var checkbox2: CheckBox
    private lateinit var checkbox3: CheckBox
    private lateinit var checkbox4: CheckBox
    private lateinit var checkbox5: CheckBox
    private lateinit var checkbox6: CheckBox
    private lateinit var checkbox7: CheckBox
    private lateinit var checkbox8: CheckBox
    private lateinit var checkbox9: CheckBox
    private lateinit var checkbox10: CheckBox
    private lateinit var checkbox11: CheckBox
    private lateinit var checkbox12: CheckBox
    private lateinit var checkbox13: CheckBox
    private lateinit var checkbox14: CheckBox
    private lateinit var checkbox15: CheckBox
    private lateinit var checkbox16: CheckBox
    private lateinit var checkbox17: CheckBox
    private lateinit var checkbox18: CheckBox
    private lateinit var checkbox19: CheckBox
    private lateinit var checkbox20: CheckBox
    private lateinit var hasilButton: Button

    private fun initComponent(){
        checkbox1 = findViewById(R.id.checkBox1)
        checkbox2 = findViewById(R.id.checkBox2)
        checkbox3 = findViewById(R.id.checkBox3)
        checkbox4 = findViewById(R.id.checkBox4)
        checkbox5 = findViewById(R.id.checkBox5)
        checkbox6 = findViewById(R.id.checkBox6)
        checkbox7 = findViewById(R.id.checkBox7)
        checkbox8 = findViewById(R.id.checkBox8)
        checkbox9 = findViewById(R.id.checkBox9)
        checkbox10 = findViewById(R.id.checkBox10)
        checkbox11 = findViewById(R.id.checkBox11)
        checkbox12 = findViewById(R.id.checkBox12)
        checkbox13 = findViewById(R.id.checkBox13)
        checkbox14 = findViewById(R.id.checkBox14)
        checkbox15 = findViewById(R.id.checkBox15)
        checkbox16 = findViewById(R.id.checkBox16)
        checkbox17 = findViewById(R.id.checkBox17)
        checkbox18 = findViewById(R.id.checkBox18)
        checkbox19 = findViewById(R.id.checkBox19)
        checkbox20 = findViewById(R.id.checkBox20)
        hasilButton = findViewById(R.id.hasilbutton)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosa)

        window.statusBarColor = ContextCompat.getColor(this@DiagnosaActivity, R.color.red)
        supportActionBar?.hide()
        initComponent()
        hasilButton.setOnClickListener{
            rules()
            this.showDialog(rules())

        }

    }


    private fun rules(): String{
        var result = ""

        if (checkbox3.isChecked() && checkbox8.isChecked() && checkbox9.isChecked() &&
            checkbox10.isChecked() && checkbox19.isChecked() && checkbox20.isChecked()) {
            result += "Diare Dehidrasi"
        } else if (checkbox3.isChecked() && checkbox8.isChecked() && checkbox9.isChecked() &&
            checkbox10.isChecked()) {
            result += "Diare"
        } else  if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked() && checkbox4.isChecked() &&
            checkbox5.isChecked() && checkbox6.isChecked() && checkbox7.isChecked() ) {
            result += "Disetri"
        } else if (checkbox11.isChecked() && checkbox1.isChecked() && checkbox12.isChecked() &&
            checkbox13.isChecked() && checkbox14.isChecked()){
            result += "Kontipasi"
        }else if (checkbox5.isChecked() && checkbox15.isChecked() && checkbox16.isChecked() &&
            checkbox3.isChecked() && checkbox2.isChecked() && checkbox17.isChecked() &&
            checkbox8.isChecked()){
            result+= "Cacingan"
        } else if (checkbox1.isChecked() && checkbox2.isChecked() && checkbox12.isChecked() && checkbox7.isChecked()){
            result += "Maag"
        } else{
            result += "Maaf Gejala yang anda masukan tidak ada dalam rules"
        }

        return result
    }

}
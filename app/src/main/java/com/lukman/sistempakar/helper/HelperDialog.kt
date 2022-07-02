package com.lukman.sistempakar.helper

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.lukman.sistempakar.R

fun Activity.showDialog(
    msg: String?
){

    val dialog = Dialog(this)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setCancelable(false)
    dialog.setContentView(R.layout.dialog_view)

    val massage = dialog.findViewById<TextView>(R.id.hasilTextView)
    msg?.let { massage.text = it }

    val btnOk = dialog.findViewById<Button>(R.id.btnOK)
    btnOk.setOnClickListener{
        dialog.dismiss()
    }
    dialog.show()
}
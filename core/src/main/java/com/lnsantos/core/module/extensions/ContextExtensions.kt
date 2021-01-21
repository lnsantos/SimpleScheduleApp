package com.lnsantos.core.module.extensions

import android.content.Context
import android.widget.Toast

fun Context.sendToastLong(message: String){
    Toast.makeText(this,message, Toast.LENGTH_LONG).show()
}

fun Context.sendToastShort(message: String){
    Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
}
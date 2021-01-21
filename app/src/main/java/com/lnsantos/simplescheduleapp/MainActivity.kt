package com.lnsantos.simplescheduleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lnsantos.core.module.extensions.sendToastLong
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var schedule : com.lnsantos.core.module.ScheduleUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendToastLong(schedule.getTag())
    }

}
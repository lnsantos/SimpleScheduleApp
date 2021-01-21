package com.lnsantos.core.module

import javax.inject.Inject

class ScheduleUtils @Inject constructor() {

    fun getTag() : String = this::class.java.simpleName

}
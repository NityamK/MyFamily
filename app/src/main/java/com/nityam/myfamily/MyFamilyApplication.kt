package com.nityam.myfamily

import android.app.Application

class MyFamilyApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        SharedPref.init(this)
    }
}
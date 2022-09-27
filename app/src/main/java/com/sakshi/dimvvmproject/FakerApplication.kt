package com.sakshi.dimvvmproject

import android.app.Application
import com.sakshi.dimvvmproject.di.ApplicationComponent
import com.sakshi.dimvvmproject.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}
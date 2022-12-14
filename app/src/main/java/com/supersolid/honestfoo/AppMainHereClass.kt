package com.supersolid.honestfoo

import android.app.Application
import com.onesignal.OneSignal
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Singleton


@HiltAndroidApp
@Singleton
class AppMainHereClass:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId("752e313e-6b5d-430d-96b5-11e10f4eaad5")

    }

}
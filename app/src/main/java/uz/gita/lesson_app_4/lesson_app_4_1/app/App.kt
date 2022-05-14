package uz.gita.lesson_app_4.lesson_app_4_1.app

import android.app.Application
import uz.gita.lesson_app_4.lesson_app_4_1.data.local.SharedPref
import uz.gita.lesson_app_4.lesson_app_4_1.data.repository.AppRepository

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        AppRepository.initRepository()

        SharedPref.init(this)
    }
}
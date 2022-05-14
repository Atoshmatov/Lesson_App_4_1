package uz.gita.lesson_app_4.lesson_app_4_1.data.local

import android.content.Context
import android.content.SharedPreferences

class SharedPref {
    companion object {
        private var sharedPref: SharedPref? = null
        private var pref: SharedPreferences? = null

        fun init(context: Context) {
            sharedPref = SharedPref()
            pref = context.getSharedPreferences("Saple", Context.MODE_PRIVATE)
        }

        fun getShredPref(): SharedPref {
            return sharedPref!!
        }
    }

    var pos: Int
        set(value) = pref!!.edit().putInt("POS", value).apply();
        get() = pref!!.getInt("POS", 0)

    var coins: Int
        get() = pref!!.getInt("COINS", 0)
        set(value) {
            val oldValue = coins
            pref!!.edit().putInt("COINS", oldValue + value).apply()
        }
}
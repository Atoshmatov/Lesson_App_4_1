package uz.gita.lesson_app_4.lesson_app_4_1.dialog

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle

class WinDialog(context: Context) : AlertDialog(context) {
    private var listener: (() -> Unit)? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
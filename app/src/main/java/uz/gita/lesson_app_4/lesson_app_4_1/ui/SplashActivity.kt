package uz.gita.lesson_app_4.lesson_app_4_1.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.airbnb.lottie.LottieAnimationView
import uz.gita.lesson_app_4.lesson_app_4_1.R

class SplashActivity : AppCompatActivity() {
    private lateinit var lottieAnimationView: LottieAnimationView
    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.toolbar_color2)


        lottieAnimationView = findViewById(R.id.splash)
        lottieAnimationView.setMinAndMaxFrame(0, 500)
        lottieAnimationView.playAnimation()
        handler = Handler()
        runnable = Runnable {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            lottieAnimationView.pauseAnimation()
            finish()
        }
        handler.postDelayed(runnable, 10000)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}
package uz.gita.lesson_app_4.lesson_app_4_1.ui

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.material.card.MaterialCardView
import uz.gita.lesson_app_4.lesson_app_4_1.R
import uz.gita.lesson_app_4.lesson_app_4_1.contract.MainContract
import uz.gita.lesson_app_4.lesson_app_4_1.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var playButton: MaterialCardView
    private lateinit var textCoins: AppCompatTextView
    private lateinit var textLevel: AppCompatTextView
    private lateinit var image1: AppCompatImageView
    private lateinit var image2: AppCompatImageView
    private lateinit var image3: AppCompatImageView
    private lateinit var image4: AppCompatImageView

    private lateinit var presenter: MainContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_main)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.toolbar_color)
        window.statusBarColor = ContextCompat.getColor(this, R.color.toolbar_color)

        initView()
        presenter = MainPresenter(this)

        findViewById<AppCompatImageView>(R.id.about).setOnClickListener {
            val dialog = Dialog(this@MainActivity)
            dialog.setContentView(R.layout.aboutdialog)
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.window
                ?.setLayout(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
            dialog.setCancelable(false)
            val yes: AppCompatButton = dialog.findViewById(R.id.yes_about)

            yes.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }
    }

    private fun initView() {
        playButton = findViewById(R.id.playGame)
        playButton.setOnClickListener {
            presenter.onClickStart()
        }
        textCoins = findViewById(R.id.coins_2)
        textLevel = findViewById(R.id.textLevel)
        image1 = findViewById(R.id.image_main_1)
        image2 = findViewById(R.id.image_main_2)
        image3 = findViewById(R.id.image_main_3)
        image4 = findViewById(R.id.image_main_4)
    }

    override fun onResume() {
        super.onResume()
        presenter.init()
    }

    override fun navigateToGameScreen() {
        val intent = Intent(this@MainActivity, GameActivity::class.java)
        startActivity(intent)
    }

    override fun setCurrentQuestionPosition(position: Int) {
        textLevel.text = position.toString()
    }

    override fun setImages(images: List<Int>) {
        image1.setImageResource(images[0])
        image2.setImageResource(images[1])
        image3.setImageResource(images[2])
        image4.setImageResource(images[3])
        YoYo.with(Techniques.Pulse)
            .duration(700)
            .playOn(findViewById(R.id.cv_image_1));
        YoYo.with(Techniques.Pulse)
            .duration(700)
            .playOn(findViewById(R.id.cv_image_2));
        YoYo.with(Techniques.Pulse)
            .duration(700)
            .playOn(findViewById(R.id.cv_image_3));
        YoYo.with(Techniques.Pulse)
            .duration(700)
            .playOn(findViewById(R.id.cv_image_4));
    }

    override fun setCurrentCoins(coins: Int) {
        textCoins.text = coins.toString()
    }
}
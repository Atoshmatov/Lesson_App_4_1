package uz.gita.lesson_app_4.lesson_app_4_1.ui

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import uz.gita.lesson_app_4.lesson_app_4_1.R
import uz.gita.lesson_app_4.lesson_app_4_1.contract.GameContract
import uz.gita.lesson_app_4.lesson_app_4_1.presenter.GamePresenter
import uz.gita.lesson_app_4.lesson_app_4_1.utils.DurationValues

class GameActivity : AppCompatActivity(), GameContract.View, View.OnClickListener {

    private lateinit var answers: ArrayList<AppCompatTextView>
    private lateinit var variants: ArrayList<AppCompatTextView>
    private lateinit var presenter: GameContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_game)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.toolbar_color)
        window.statusBarColor = ContextCompat.getColor(this, R.color.toolbar_color)

        loadViews()
        presenter = GamePresenter(this)
        presenter.init()


    }

    private fun loadViews() {
        findViewById<AppCompatImageView>(R.id.backBtn).setOnClickListener {
            presenter.onClickBack()
        }
        findViewById<AppCompatTextView>(R.id.answer_1).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_2).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_3).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_4).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_5).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_6).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.answer_7).setOnClickListener(this)

        answers = ArrayList()
        answers.add(findViewById(R.id.answer_1))
        answers.add(findViewById(R.id.answer_2))
        answers.add(findViewById(R.id.answer_3))
        answers.add(findViewById(R.id.answer_4))
        answers.add(findViewById(R.id.answer_5))
        answers.add(findViewById(R.id.answer_6))
        answers.add(findViewById(R.id.answer_7))

        findViewById<AppCompatTextView>(R.id.variant_1).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_2).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_3).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_4).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_5).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_6).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_7).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_8).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_9).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_10).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_11).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_12).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_13).setOnClickListener(this)
        findViewById<AppCompatTextView>(R.id.variant_14).setOnClickListener(this)
        variants = ArrayList()
        variants.add(findViewById(R.id.variant_1))
        variants.add(findViewById(R.id.variant_2))
        variants.add(findViewById(R.id.variant_3))
        variants.add(findViewById(R.id.variant_4))
        variants.add(findViewById(R.id.variant_5))
        variants.add(findViewById(R.id.variant_6))
        variants.add(findViewById(R.id.variant_7))
        variants.add(findViewById(R.id.variant_8))
        variants.add(findViewById(R.id.variant_9))
        variants.add(findViewById(R.id.variant_10))
        variants.add(findViewById(R.id.variant_11))
        variants.add(findViewById(R.id.variant_12))
        variants.add(findViewById(R.id.variant_13))
        variants.add(findViewById(R.id.variant_14))
    }


    override fun onClick(p0: View?) {
        when (p0?.id) {
            answers[0].id -> {
                presenter.clickedAnswerButton(0)
            }
            answers[1].id -> {
                presenter.clickedAnswerButton(1)
            }
            answers[2].id -> {
                presenter.clickedAnswerButton(2)
            }
            answers[3].id -> {
                presenter.clickedAnswerButton(3)
            }
            answers[4].id -> {
                presenter.clickedAnswerButton(4)
            }
            answers[5].id -> {
                presenter.clickedAnswerButton(5)
            }
            answers[6].id -> {
                presenter.clickedAnswerButton(6)
            }
            variants[0].id -> {
                presenter.clickedVariantButton(0)
            }
            variants[1].id -> {
                presenter.clickedVariantButton(1)
            }
            variants[2].id -> {
                presenter.clickedVariantButton(2)
            }
            variants[3].id -> {
                presenter.clickedVariantButton(3)
            }
            variants[4].id -> {
                presenter.clickedVariantButton(4)
            }
            variants[5].id -> {
                presenter.clickedVariantButton(5)
            }
            variants[6].id -> {
                presenter.clickedVariantButton(6)
            }
            variants[7].id -> {
                presenter.clickedVariantButton(7)
            }
            variants[8].id -> {
                presenter.clickedVariantButton(8)
            }
            variants[9].id -> {
                presenter.clickedVariantButton(9)
            }
            variants[10].id -> {
                presenter.clickedVariantButton(10)
            }
            variants[11].id -> {
                presenter.clickedVariantButton(11)
            }
            variants[12].id -> {
                presenter.clickedVariantButton(12)
            }
            variants[13].id -> {
                presenter.clickedVariantButton(13)
            }
        }

    }

    override fun setCurrentQuestionPosition(position: Int) {
        findViewById<AppCompatTextView>(R.id.level).text = "Level ${position.toString()}"
    }

    override fun setCurrentCoinsValue(coins: Int) {
        findViewById<AppCompatTextView>(R.id.coins).text = coins.toString()
    }

    override fun setImageByPosition(images: List<Int>) {
        findViewById<AppCompatImageView>(R.id.image_game_1).setImageResource(images[0])
        findViewById<AppCompatImageView>(R.id.image_game_2).setImageResource(images[1])
        findViewById<AppCompatImageView>(R.id.image_game_3).setImageResource(images[2])
        findViewById<AppCompatImageView>(R.id.image_game_4).setImageResource(images[3])
    }

    override fun setCurrentAnswerLength(length: Int) {
        for (i in 0 until length) {
            answers[i].visibility = View.VISIBLE
        }
        for (i in length until answers.size) {
            answers[i].visibility = View.GONE
        }
    }

    override fun setVariantsByPosition(variant: List<Char>) {
        for (i in variants.indices) {
            variants[i].text = variant[i].toString()
        }

    }

    override fun clearAnswerAndVariant() {
        for (i in 0 until answers.size) {
            answers[i].text = ""
            answers[i].isEnabled = false
        }
        for (i in 0 until variants.size) {
            variants[i].isEnabled = true
        }
    }

    override fun disableAnswerButtonByPosition(position: Int) {
        answers[position].isEnabled = false
        answers[position].text = ""

    }

    override fun disableVariantButtonByPosition(position: Int) {
        variants[position].isEnabled = false
        variants[position].text = ""
    }

    override fun setLetterToAnswerButtonByPosition(position: Int, letter: Char) {
        answers[position].isEnabled = true
        answers[position].text = letter.toString()
    }

    override fun setLetterToVariantButtonByPosition(position: Int, letter: Char) {
        variants[position].isEnabled = true
        variants[position].text = letter.toString()
    }

    override fun playAnimationButtonAnswer(position: Int) {
        YoYo.with(Techniques.Pulse).duration(DurationValues.BUTTONS_DURATION.duration)
            .playOn(answers[position])
    }

    override fun playAnimationButtonVariant(position: Int) {
        YoYo.with(Techniques.Pulse).duration(DurationValues.BUTTONS_DURATION.duration)
            .playOn(variants[position])
    }

    override fun playAnimationWrongAnswer() {
        YoYo.with(Techniques.Shake).duration(DurationValues.WRONG_ANSWER_DURATION.duration)
            .playOn(findViewById(R.id.wrapper_answer))
    }

    override fun correctAnswer() {
        val dialog = Dialog(this@GameActivity)
        dialog.setContentView(R.layout.windialog)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.window
            ?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.setCancelable(false)
        val yes: AppCompatButton = dialog.findViewById(R.id.yes)

        yes.setOnClickListener {
            presenter.loadData()
            dialog.dismiss()
        }
        dialog.show()
//        val dialog = android.app.AlertDialog.Builder(this).setTitle("Correct")
//            .setMessage("Congratulations").setPositiveButton("Ok") { _, _ ->
//                presenter.loadData()
//            }.create()
//        dialog.show()
    }

    override fun onClickBackButton() {
        super.onBackPressed()
    }
}
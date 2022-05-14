package uz.gita.lesson_app_4.lesson_app_4_1.presenter

import uz.gita.lesson_app_4.lesson_app_4_1.contract.GameContract
import uz.gita.lesson_app_4.lesson_app_4_1.model.GameModel

class GamePresenter(private val view: GameContract.View) : GameContract.Presenter {

    private val model: GameContract.Model = GameModel()

    private val images: MutableList<Int> = ArrayList()

    private var currentPosition: Int = 0
    private var answer: String = ""
    private var variant: String = ""

    private var tagAnswer: StringBuilder = StringBuilder()
    private var tagVariant: StringBuilder = StringBuilder()
    override fun init() {
        currentPosition = model.getCurrentQuestionPosition()
        loadData()
    }

    override fun loadData() {
        if (!model.canGetDataByPosition(currentPosition)) {
            currentPosition = 0
            model.saveQuestionPosition(currentPosition)
        }
        view.clearAnswerAndVariant()

        val data = model.getDataByPosition(currentPosition)

        answer = data.answer
        tagAnswer = StringBuilder("#######".substring(0, data.answer.length))
        variant = data.variant
        tagVariant = StringBuilder("##############")

        images.clear()
        images.add(data.image_1)
        images.add(data.image_2)
        images.add(data.image_3)
        images.add(data.image_4)

        view.setCurrentQuestionPosition(currentPosition + 1)
        view.setCurrentCoinsValue(model.getCurrentCoins())
        view.setImageByPosition(images)
        view.setCurrentAnswerLength(data.answer.length)
        view.setVariantsByPosition(data.variant.toList())
    }

    override fun clickedAnswerButton(position: Int) {
        view.playAnimationButtonAnswer(position)
        val letter = tagAnswer[position]

        val indexOfTagVariant = tagVariant.indexOf(letter)
        val indexOfTargetAnswer = tagAnswer.indexOf("#")

        tagVariant.setCharAt(indexOfTagVariant, '#')
        tagAnswer.setCharAt(position, '#')
        view.disableAnswerButtonByPosition(position)
        view.setLetterToVariantButtonByPosition(indexOfTagVariant, letter)
    }

    override fun clickedVariantButton(position: Int) {

        val letter = variant[position]

        val indexOfTagAnswer = tagAnswer.indexOf("#")

        if (indexOfTagAnswer >= 0) {
            tagAnswer.setCharAt(indexOfTagAnswer, letter)
            tagVariant.setCharAt(position, letter)

            view.setLetterToAnswerButtonByPosition(indexOfTagAnswer, letter)
            view.disableVariantButtonByPosition(position)
        }
        if (hasFinished()) check()
    }

    private fun hasFinished(): Boolean = !tagAnswer.toString().contains("#")

    private fun check() {
        when (answer) {
            tagAnswer.toString() -> {
                model.saveCurrentCoins()
                currentPosition++
                model.saveQuestionPosition(currentPosition)
                view.correctAnswer()
            }
            else -> view.playAnimationWrongAnswer()
        }
    }

    override fun onClickBack() {
        view.onClickBackButton()
    }
}
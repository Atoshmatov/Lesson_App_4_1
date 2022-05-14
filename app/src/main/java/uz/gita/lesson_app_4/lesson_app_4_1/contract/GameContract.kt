package uz.gita.lesson_app_4.lesson_app_4_1.contract

import uz.gita.lesson_app_4.lesson_app_4_1.data.data.QuestionData

interface GameContract {
    interface Model {
        fun getDataByPosition(position: Int): QuestionData
        fun getCurrentQuestionPosition(): Int
        fun getCurrentCoins(): Int

        fun saveQuestionPosition(position: Int)
        fun saveCurrentCoins()

        fun canGetDataByPosition(position: Int): Boolean
    }

    interface View {
        fun setCurrentQuestionPosition(position: Int)
        fun setCurrentCoinsValue(coins: Int)

        fun setImageByPosition(images: List<Int>)
        fun setCurrentAnswerLength(length: Int)
        fun setVariantsByPosition(variant: List<Char>)
        fun clearAnswerAndVariant()

        fun disableAnswerButtonByPosition(position: Int)
        fun disableVariantButtonByPosition(position: Int)
        fun setLetterToAnswerButtonByPosition(position: Int, letter: Char)
        fun setLetterToVariantButtonByPosition(position: Int, letter: Char)

        fun playAnimationButtonAnswer(position: Int)
        fun playAnimationButtonVariant(position: Int)
        fun playAnimationWrongAnswer()

        fun correctAnswer()
        fun onClickBackButton()

    }

    interface Presenter {
        fun init()
        fun loadData()

        fun clickedAnswerButton(position: Int)
        fun clickedVariantButton(position: Int)

       /* fun saveCoins()
        fun saveQuestionPosition()*/

        fun onClickBack()
    }
}
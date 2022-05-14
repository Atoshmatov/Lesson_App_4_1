package uz.gita.lesson_app_4.lesson_app_4_1.presenter

import uz.gita.lesson_app_4.lesson_app_4_1.contract.MainContract
import uz.gita.lesson_app_4.lesson_app_4_1.model.MainModel

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    private val model: MainContract.Model = MainModel()

    override fun init() {
        view.setCurrentCoins(model.getCurrentCoins())
        view.setCurrentQuestionPosition(model.getQuestionPosition() + 1)
        view.setImages(model.getImages())
    }

    override fun onClickStart() {
        view.navigateToGameScreen()
    }

    override fun onClickSettings() {

    }
}
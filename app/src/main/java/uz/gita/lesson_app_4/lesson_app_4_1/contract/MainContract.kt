package uz.gita.lesson_app_4.lesson_app_4_1.contract

interface MainContract {
    interface Model {
        fun getImages(): List<Int>
        fun getQuestionPosition(): Int
        fun getCurrentCoins(): Int
    }

    interface View {
        fun navigateToGameScreen()

        fun setCurrentQuestionPosition(position: Int)
        fun setImages(images: List<Int>)
        fun setCurrentCoins(coins: Int)
    }

    interface Presenter {
        fun init()

        fun onClickStart()
        fun onClickSettings()
    }
}
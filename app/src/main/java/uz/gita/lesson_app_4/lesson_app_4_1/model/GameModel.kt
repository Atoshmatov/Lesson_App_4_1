package uz.gita.lesson_app_4.lesson_app_4_1.model

import uz.gita.lesson_app_4.lesson_app_4_1.contract.GameContract
import uz.gita.lesson_app_4.lesson_app_4_1.data.data.QuestionData
import uz.gita.lesson_app_4.lesson_app_4_1.data.repository.AppRepository

class GameModel : GameContract.Model {

    private val repository: AppRepository = AppRepository().getAppRepository()

    override fun getDataByPosition(position: Int): QuestionData =
        repository.getDataByPosition(position)

    override fun getCurrentQuestionPosition(): Int = repository.getCurrentQuestionPosition()

    override fun getCurrentCoins(): Int = repository.getCurrentCoins()

    override fun saveQuestionPosition(position: Int) =
        repository.saveCurrentQuestionPosition(position)

    override fun saveCurrentCoins() {
        repository.saveCurrentCoins(4)
    }

    override fun canGetDataByPosition(position: Int): Boolean =
        repository.isAvailableDataByPosition(position)

}
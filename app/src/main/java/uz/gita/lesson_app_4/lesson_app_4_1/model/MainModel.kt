package uz.gita.lesson_app_4.lesson_app_4_1.model

import uz.gita.lesson_app_4.lesson_app_4_1.contract.MainContract
import uz.gita.lesson_app_4.lesson_app_4_1.data.repository.AppRepository

class MainModel : MainContract.Model {
    private val repository: AppRepository = AppRepository().getAppRepository()

    override fun getImages(): List<Int> {
        val position = repository.getCurrentQuestionPosition()
        val data = repository.getDataByPosition(position)
        val images = ArrayList<Int>()
        images.add(data.image_1)
        images.add(data.image_2)
        images.add(data.image_3)
        images.add(data.image_4)
        return images
    }

    override fun getQuestionPosition(): Int = repository.getCurrentQuestionPosition()

    override fun getCurrentCoins(): Int = repository.getCurrentCoins()
}
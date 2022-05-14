package uz.gita.lesson_app_4.lesson_app_4_1.data.repository

import uz.gita.lesson_app_4.lesson_app_4_1.R
import uz.gita.lesson_app_4.lesson_app_4_1.data.data.QuestionData
import uz.gita.lesson_app_4.lesson_app_4_1.data.local.SharedPref

class AppRepository {
    private val questionsList: ArrayList<QuestionData> = ArrayList()

    init {
        loadData()
    }

    companion object {
        private var repository: AppRepository? = null
        fun initRepository() {
            if (repository != null) return
            else repository = AppRepository()
        }
    }

    fun getAppRepository(): AppRepository {
        return repository!!
    }

    private fun loadData() {
        questionsList.add(
            QuestionData(
                id = 1,
                image_1 = R.drawable.item_1_1,
                image_2 = R.drawable.item_1_2,
                image_3 = R.drawable.item_1_3,
                image_4 = R.drawable.item_1_4,
                answer = "MOUSE",
                variant = "AEMDOFUFSYIPEW"
            )
        )
        questionsList.add(
            QuestionData(
                id = 2,
                image_1 = R.drawable.item_2_1,
                image_2 = R.drawable.item_2_2,
                image_3 = R.drawable.item_2_3,
                image_4 = R.drawable.item_2_4,
                answer = "ICE",
                variant = "YIPEDOCUFSWAEM"
            )
        )
        questionsList.add(
            QuestionData(
                id = 3,
                image_1 = R.drawable.item_3_1,
                image_2 = R.drawable.item_3_2,
                image_3 = R.drawable.item_3_3,
                image_4 = R.drawable.item_3_4,
                answer = "TACKLE",
                variant = "AECKWOTABSDLEE"
            )
        )

        questionsList.add(
            QuestionData(
                id = 4,
                image_1 = R.drawable.item_4_1,
                image_2 = R.drawable.item_4_2,
                image_3 = R.drawable.item_4_3,
                image_4 = R.drawable.item_4_4,
                answer = "ROOT",
                variant = "RSDRWOFGTOTYTE"
            )
        )
        questionsList.add(
            QuestionData(
                id = 5,
                image_1 = R.drawable.item_5_1,
                image_2 = R.drawable.item_5_2,
                image_3 = R.drawable.item_5_3,
                image_4 = R.drawable.item_5_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )

        questionsList.add(
            QuestionData(
                id = 6,
                image_1 = R.drawable.item_6_1,
                image_2 = R.drawable.item_6_2,
                image_3 = R.drawable.item_6_3,
                image_4 = R.drawable.item_6_4,
                answer = "SITE",
                variant = "SQSCIRFGYTUIEB"
            )
        )
        questionsList.add(
            QuestionData(
                id = 7,
                image_1 = R.drawable.item_7_1,
                image_2 = R.drawable.item_7_2,
                image_3 = R.drawable.item_7_3,
                image_4 = R.drawable.item_7_4,
                answer = "POTATO",
                variant = "PLIHTOTFOERASD"
            )
        )
        questionsList.add(
            QuestionData(
                id = 8,
                image_1 = R.drawable.item_8_1,
                image_2 = R.drawable.item_8_2,
                image_3 = R.drawable.item_8_3,
                image_4 = R.drawable.item_8_4,
                answer = "BEEF",
                variant = "DEYBPLMREMHEFQ"
            )
        )
        questionsList.add(
            QuestionData(
                id = 9,
                image_1 = R.drawable.item_9_1,
                image_2 = R.drawable.item_9_2,
                image_3 = R.drawable.item_9_3,
                image_4 = R.drawable.item_9_4,
                answer = "CHICKEN",
                variant = "EECYCHIKNERTYG"
            )
        )
        questionsList.add(
            QuestionData(
                id = 10,
                image_1 = R.drawable.item_10_1,
                image_2 = R.drawable.item_10_2,
                image_3 = R.drawable.item_10_3,
                image_4 = R.drawable.item_10_4,
                answer = "TUNA",
                variant = "YWNRTAHGJUUGHF"
            )
        )
        questionsList.add(
            QuestionData(
                id = 11,
                image_1 = R.drawable.item_11_1,
                image_2 = R.drawable.item_11_2,
                image_3 = R.drawable.item_11_3,
                image_4 = R.drawable.item_11_4,
                answer = "MAPLE",
                variant = "MEAPUERYLEYUJH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 12,
                image_1 = R.drawable.item_12_1,
                image_2 = R.drawable.item_12_2,
                image_3 = R.drawable.item_12_3,
                image_4 = R.drawable.item_12_4,
                answer = "LAUGH",
                variant = "HDEDFUFGBGBLAB"
            )
        )
        questionsList.add(
            QuestionData(
                id = 13,
                image_1 = R.drawable.item_13_1,
                image_2 = R.drawable.item_13_2,
                image_3 = R.drawable.item_13_3,
                image_4 = R.drawable.item_13_4,
                answer = "CART",
                variant = "RGCFATGEGWDFJH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 14,
                image_1 = R.drawable.item_14_1,
                image_2 = R.drawable.item_14_2,
                image_3 = R.drawable.item_14_3,
                image_4 = R.drawable.item_14_4,
                answer = "BRUSH",
                variant = "BCSSVRBSHUGXHH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 15,
                image_1 = R.drawable.item_15_1,
                image_2 = R.drawable.item_15_2,
                image_3 = R.drawable.item_15_3,
                image_4 = R.drawable.item_15_4,
                answer = "BRACE",
                variant = "RHCDGHAEDHBVVH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 16,
                image_1 = R.drawable.item_16_1,
                image_2 = R.drawable.item_16_2,
                image_3 = R.drawable.item_16_3,
                image_4 = R.drawable.item_16_4,
                answer = "DIP",
                variant = "WOHOBRIYBRDPCG"
            )
        )
        questionsList.add(
            QuestionData(
                id = 17,
                image_1 = R.drawable.item_17_1,
                image_2 = R.drawable.item_17_2,
                image_3 = R.drawable.item_17_3,
                image_4 = R.drawable.item_17_4,
                answer = "POD",
                variant = "NVDYFROFGBPGIH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 18,
                image_1 = R.drawable.item_18_1,
                image_2 = R.drawable.item_18_2,
                image_3 = R.drawable.item_18_3,
                image_4 = R.drawable.item_18_4,
                answer = "MAT",
                variant = "GHTJADCMKFDKVH"
            )
        )
        questionsList.add(
            QuestionData(
                id = 19,
                image_1 = R.drawable.item_19_1,
                image_2 = R.drawable.item_19_2,
                image_3 = R.drawable.item_19_3,
                image_4 = R.drawable.item_19_4,
                answer = "DRIP",
                variant = "VDKGDBNRFPNIXU"
            )
        )
       /* questionsList.add(
            QuestionData(
                id = 20,
                image_1 = R.drawable.item_20_1,
                image_2 = R.drawable.item_20_2,
                image_3 = R.drawable.item_20_3,
                image_4 = R.drawable.item_20_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 21,
                image_1 = R.drawable.item_21_1,
                image_2 = R.drawable.item_21_2,
                image_3 = R.drawable.item_21_3,
                image_4 = R.drawable.item_21_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 22,
                image_1 = R.drawable.item_22_1,
                image_2 = R.drawable.item_22_2,
                image_3 = R.drawable.item_22_3,
                image_4 = R.drawable.item_22_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 23,
                image_1 = R.drawable.item_23_1,
                image_2 = R.drawable.item_23_2,
                image_3 = R.drawable.item_23_3,
                image_4 = R.drawable.item_23_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 24,
                image_1 = R.drawable.item_24_1,
                image_2 = R.drawable.item_24_2,
                image_3 = R.drawable.item_24_3,
                image_4 = R.drawable.item_24_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 25,
                image_1 = R.drawable.item_25_1,
                image_2 = R.drawable.item_25_2,
                image_3 = R.drawable.item_25_3,
                image_4 = R.drawable.item_25_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 26,
                image_1 = R.drawable.item_26_1,
                image_2 = R.drawable.item_26_2,
                image_3 = R.drawable.item_26_3,
                image_4 = R.drawable.item_26_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 27,
                image_1 = R.drawable.item_27_1,
                image_2 = R.drawable.item_27_2,
                image_3 = R.drawable.item_27_3,
                image_4 = R.drawable.item_27_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 28,
                image_1 = R.drawable.item_28_1,
                image_2 = R.drawable.item_28_2,
                image_3 = R.drawable.item_28_3,
                image_4 = R.drawable.item_28_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 29,
                image_1 = R.drawable.item_29_1,
                image_2 = R.drawable.item_29_2,
                image_3 = R.drawable.item_29_3,
                image_4 = R.drawable.item_29_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 30,
                image_1 = R.drawable.item_30_1,
                image_2 = R.drawable.item_30_2,
                image_3 = R.drawable.item_30_3,
                image_4 = R.drawable.item_30_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 31,
                image_1 = R.drawable.item_31_1,
                image_2 = R.drawable.item_31_2,
                image_3 = R.drawable.item_31_3,
                image_4 = R.drawable.item_31_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 32,
                image_1 = R.drawable.item_32_1,
                image_2 = R.drawable.item_32_2,
                image_3 = R.drawable.item_32_3,
                image_4 = R.drawable.item_32_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 33,
                image_1 = R.drawable.item_33_1,
                image_2 = R.drawable.item_33_2,
                image_3 = R.drawable.item_33_3,
                image_4 = R.drawable.item_33_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 34,
                image_1 = R.drawable.item_34_1,
                image_2 = R.drawable.item_34_2,
                image_3 = R.drawable.item_34_3,
                image_4 = R.drawable.item_34_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 35,
                image_1 = R.drawable.item_35_1,
                image_2 = R.drawable.item_35_2,
                image_3 = R.drawable.item_35_3,
                image_4 = R.drawable.item_35_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 36,
                image_1 = R.drawable.item_36_1,
                image_2 = R.drawable.item_36_2,
                image_3 = R.drawable.item_36_3,
                image_4 = R.drawable.item_36_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 37,
                image_1 = R.drawable.item_37_1,
                image_2 = R.drawable.item_37_2,
                image_3 = R.drawable.item_37_3,
                image_4 = R.drawable.item_37_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 38,
                image_1 = R.drawable.item_38_1,
                image_2 = R.drawable.item_38_2,
                image_3 = R.drawable.item_38_3,
                image_4 = R.drawable.item_38_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 39,
                image_1 = R.drawable.item_39_1,
                image_2 = R.drawable.item_39_2,
                image_3 = R.drawable.item_39_3,
                image_4 = R.drawable.item_39_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )
        questionsList.add(
            QuestionData(
                id = 40,
                image_1 = R.drawable.item_40_1,
                image_2 = R.drawable.item_40_2,
                image_3 = R.drawable.item_40_3,
                image_4 = R.drawable.item_40_4,
                answer = "WET",
                variant = "ASERWFDYHEFDST"
            )
        )*/
    }

    //    connection with data
    fun getDataByPosition(position: Int): QuestionData = questionsList[position]

    //  connection with data
    fun isAvailableDataByPosition(position: Int): Boolean = questionsList.size - 1 >= position

    // image save sharedPref
    fun saveCurrentQuestionPosition(position: Int) {
        SharedPref.getShredPref().pos = position
    }

    // image get sharedPref
    fun getCurrentQuestionPosition(): Int = SharedPref.getShredPref().pos

    // connection with sharedPreferences
    fun saveCurrentCoins(coins: Int) {
        SharedPref.getShredPref().coins = coins
    }

    // connection with sharedPreferences
    fun getCurrentCoins(): Int = SharedPref.getShredPref().coins

}
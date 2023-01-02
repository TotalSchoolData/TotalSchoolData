package com.example.network.model

data class NetworkMealService(
    val mealServiceDietInfo: List<MealServiceDietInfo>
) {
    data class MealServiceDietInfo(
        val head: List<Head>,
        val row: List<Row>
    ) {
        data class Head(
            val result: RESULT,
            val list_total_count: Int
        ) {
            data class RESULT(
                val CODE: String,
                val MESSAGE: String
            )
        }

        data class Row(
            val ATPT_OFCDC_SC_CODE: String,
            val ATPT_OFCDC_SC_NM: String,
            val CAL_INFO: String,
            val DDISH_NM: String,
            val MLSV_FGR: String,
            val MLSV_FROM_YMD: String,
            val MLSV_TO_YMD: String,
            val MLSV_YMD: String,
            val MMEAL_SC_CODE: String,
            val MMEAL_SC_NM: String,
            val NTR_INFO: String,
            val ORPLC_INFO: String,
            val SCHUL_NM: String,
            val SD_SCHUL_CODE: String
        )
    }
}
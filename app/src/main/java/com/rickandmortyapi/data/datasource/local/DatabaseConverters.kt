package com.rickandmortyapi.data.datasource.local

import androidx.room.TypeConverter
import java.math.BigDecimal

class DatabaseConverters {

    @TypeConverter
    fun xToY(bigDecimal: BigDecimal): String = bigDecimal.toString()
}
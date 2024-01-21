package com.rickandmortyapi.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rickandmortyapi.data.datasource.local.dao.ExampleDao
import com.rickandmortyapi.BuildConfig
import com.rickandmortyapi.data.datasource.local.entity.ExampleEntity

@Database(
    entities = [
        ExampleEntity::class
    ],
    version = BuildConfig.DATABASE_VERSION,
    exportSchema = false
)
abstract class DatabaseApp : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}
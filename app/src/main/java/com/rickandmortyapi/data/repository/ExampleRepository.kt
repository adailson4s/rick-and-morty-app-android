package com.rickandmortyapi.data.repository

import com.rickandmortyapi.data.datasource.local.dao.ExampleDao
import com.rickandmortyapi.data.datasource.local.entity.ExampleEntity

class ExampleRepository constructor(
    private val exampleDao: ExampleDao
) {
    suspend fun insert(exampleEntity: ExampleEntity) = exampleDao.insert(exampleEntity)

    suspend fun getAll(): MutableList<ExampleEntity>? = exampleDao.getAll()

    suspend fun delete(exampleEntity: ExampleEntity) = exampleDao.delete(exampleEntity)
}
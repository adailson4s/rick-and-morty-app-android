package com.rickandmortyapi.di

import com.rickandmortyapi.data.datasource.local.dao.ExampleDao
import com.rickandmortyapi.data.repository.ExampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideExampleRepository(
        exampleDao: ExampleDao
    ): ExampleRepository = ExampleRepository(exampleDao)
}
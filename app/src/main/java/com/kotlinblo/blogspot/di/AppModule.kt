package com.kotlinblo.blogspot.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kotlinblo.blogspot.db.RuningDatabase
import com.kotlinblo.blogspot.other.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRuningDataBase(@ApplicationContext app:Context)= Room.databaseBuilder(app,RuningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()
    @Singleton
    @Provides
    fun provideRunDao(db:RuningDatabase)=db.getRunDao()
}
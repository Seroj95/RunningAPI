package com.kotlinblo.blogspot.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Run::class],version = 1)
@TypeConverters(Convertes::class)
abstract class RuningDatabase : RoomDatabase() {
abstract fun getRunDao():RunDAO
}
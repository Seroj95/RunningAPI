package com.kotlinblo.blogspot.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM runing_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM runing_table ORDER BY timeMillis DESC")
    fun getAllRunsSortedByTimeMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM runing_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM runing_table ORDER BY avgSppedInKMH DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM runing_table ORDER BY distanceinMeters DESC")
    fun getAllRunsSortedByDistanc(): LiveData<List<Run>>

    @Query("SELECT SUM(timeMillis)FROM runing_table")
    fun getTotalTimeInMilles(): LiveData<Long>


    @Query("SELECT SUM(caloriesBurned)FROM runing_table")
    fun getTotalColoruisBurned(): LiveData<Int>


    @Query("SELECT SUM(distanceinMeters)FROM runing_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT AVG(avgSppedInKMH)FROM runing_table")
    fun getTotalAvgSpeed(): LiveData<Float>

}
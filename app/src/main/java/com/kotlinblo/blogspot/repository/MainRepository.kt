package com.kotlinblo.blogspot.repository

import com.kotlinblo.blogspot.db.Run
import com.kotlinblo.blogspot.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject  constructor( val runDAO: RunDAO) {
    suspend fun insertRun(run: Run)= runDAO.insertRun(run)
    suspend fun deleteRun(run: Run)= runDAO.deleteRun(run)
    fun getAllRunsSortedByDate()= runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance()= runDAO.getAllRunsSortedByDistanc()
    fun getAllRunsSortedByTimeInMilies()= runDAO.getAllRunsSortedByTimeMillis()
    fun getAllRunsSortedByAvgSpees()= runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurend()= runDAO.getAllRunsSortedByCaloriesBurned()
    fun getTotalAvgSpeed()=runDAO.getTotalAvgSpeed()
    fun getTotalDistane()=runDAO.getTotalDistance()
    fun  getTotalCaloriesBured()=runDAO.getTotalColoruisBurned()
    fun getTotalTimeMilies()=runDAO.getTotalTimeInMilles()
}
package com.kotlinblo.blogspot.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runing_table")
data class Run(
var img:Bitmap?=null,
var timeStamp:Long=0L,
var avgSppedInKMH:Float=0f,
var distanceinMeters:Int=0,
var timeMillis:Long=0L,
var caloriesBurned:Int=0
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}

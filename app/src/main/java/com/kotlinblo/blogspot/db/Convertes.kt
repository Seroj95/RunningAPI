package com.kotlinblo.blogspot.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Convertes {
@TypeConverter
    fun toBitmap(bytes: ByteArray):Bitmap{
        return BitmapFactory.decodeByteArray(bytes,0,bytes.size)
    }
    @TypeConverter
    fun fromBitmap(bmp:Bitmap):ByteArray{
        val outpytStream=ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.JPEG,100,outpytStream)
        return outpytStream.toByteArray()
    }
}
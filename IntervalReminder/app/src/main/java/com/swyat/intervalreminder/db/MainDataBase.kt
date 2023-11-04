package com.swyat.intervalreminder.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.swyat.intervalreminder.entity.Reminds

@Database (entities = [Reminds::class], version = 1)
abstract class MainDataBase : RoomDatabase() {

    companion object{
        private var INSTANCE : MainDataBase? = null
        fun getDataBase(context: Context):MainDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "interval_reminder.db").build()
                    instance

            }
        }
    }

}
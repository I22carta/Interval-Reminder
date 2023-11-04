package com.swyat.intervalreminder.activities

import android.app.Application
import com.swyat.intervalreminder.db.MainDataBase

class MainApp : Application() {
    val database by lazy{MainDataBase.getDataBase(this)}
}
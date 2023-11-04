package com.swyat.intervalreminder.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity (tableName = "reminds")
data class Reminds(
    @PrimaryKey (autoGenerate = true)
    val id: Int?,

    @ColumnInfo (name = "title")
    val title: String,

    @ColumnInfo (name = "modeOfMemorizing")
    val modeOfMemorizing: Int,

    @ColumnInfo (name = "timeBeforeReminding")
    val timeBeforeReminding: Long,
): Serializable

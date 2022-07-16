package com.example.jimenaproject.data.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id:Int = 0,
    @ColumnInfo(name = "username") val username: String,
    @ColumnInfo(name = "lastname") val lastname: String,
    @ColumnInfo(name = "dni") val dni:String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "address") val address: String,
    )


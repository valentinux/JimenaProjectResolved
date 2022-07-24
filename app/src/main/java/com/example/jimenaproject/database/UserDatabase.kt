package com.example.jimenaproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jimenaproject.data.data.dao.UserDao
import com.example.jimenaproject.data.data.entities.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDatabase: RoomDatabase(){

    abstract fun getUserDao():UserDao
}
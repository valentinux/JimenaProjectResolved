package com.example.jimenaproject.data.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.jimenaproject.data.data.entities.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM user_table ORDER BY id DESC")
    suspend fun getAllUsers():List<UserEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users:List<UserEntity>)
}
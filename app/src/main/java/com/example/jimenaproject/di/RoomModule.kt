package com.example.jimenaproject.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jimenaproject.database.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, UserDatabase::class.java, Companion.USER_DATABASE_NAME).build()

    companion object {
        private const val USER_DATABASE_NAME = "user_database"
    }

    @Singleton
    @Provides
    fun provideUserDao(db:UserDatabase) = db.getUserDao()
}
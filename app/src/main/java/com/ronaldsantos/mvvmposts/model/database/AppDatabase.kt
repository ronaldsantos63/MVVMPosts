package com.ronaldsantos.mvvmposts.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ronaldsantos.mvvmposts.model.Post
import com.ronaldsantos.mvvmposts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun postDao(): PostDao
}
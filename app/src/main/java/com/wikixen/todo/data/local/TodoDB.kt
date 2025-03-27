package com.wikixen.todo.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class TodoDB: RoomDatabase() {
    abstract fun todoDao(): TodoDao

    companion object {
        @Volatile
        private var Instance: TodoDB? = null

        fun getDB(context: Context): TodoDB {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, TodoDB::class.java, "todo_db")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}
package com.example.jetnotefinal.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jetnotefinal.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}
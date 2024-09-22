package com.example.jetnotefinal.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.jetnotefinal.model.Note

@Dao
interface NoteDatabaseDao {

    @Query("SELECT * from notes_tbl")
    fun getNotes(): List<Note>

    @Query("SELECT * from notes_tbl where id =:id")
    fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateNote(note: Note)

    @Query("DELETE from notes_tbl")
    fun deleteAllNotes()

    @Delete
    fun deleteNote(note: Note)

}

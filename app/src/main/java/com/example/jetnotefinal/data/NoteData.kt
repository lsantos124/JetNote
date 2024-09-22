package com.example.jetnotefinal.data

import com.example.jetnotefinal.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "1", description = "blah blah blah"),
            Note(title = "2", description = "blah blah blah"),
            Note(title = "3", description = "blah blah blah"),
            Note(title = "4", description = "blah blah blah")
        )
    }
}
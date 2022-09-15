package com.niiadotei.jotter.domain.repository

import com.niiadotei.jotter.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id: Int) : Note?

    suspend fun insertNote(note: Note) : Unit

    suspend fun deleteNote(note: Note) : Unit
}
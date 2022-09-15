package com.niiadotei.jotter.data.repository

import com.niiadotei.jotter.data.source.NoteDao
import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id = id)
    }

    override suspend fun insertNote(note: Note) {
        return noteDao.insertNote(note = note)
    }

    override suspend fun deleteNote(note: Note) {
        return noteDao.deleteNote(note = note)
    }
}
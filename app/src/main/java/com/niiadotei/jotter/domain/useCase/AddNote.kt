package com.niiadotei.jotter.domain.useCase

import com.niiadotei.jotter.domain.model.InvalidNoteException
import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(private val noteRepository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Note title cannot be empty")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("Note content cannot be empty")
        }

        noteRepository.insertNote(note = note)
    }
}
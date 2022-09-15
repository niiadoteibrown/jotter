package com.niiadotei.jotter.domain.useCase

import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.repository.NoteRepository

class DeleteNote(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note = note)
    }
}
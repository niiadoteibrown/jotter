package com.niiadotei.jotter.domain.useCase

import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(id: Int) : Note? {
        return noteRepository.getNoteById(id = id)
    }
}
package com.niiadotei.jotter.domain.feature

import com.niiadotei.jotter.domain.useCase.AddNote
import com.niiadotei.jotter.domain.useCase.DeleteNote
import com.niiadotei.jotter.domain.useCase.GetNote
import com.niiadotei.jotter.domain.useCase.GetNotes

data class NoteFeature(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)

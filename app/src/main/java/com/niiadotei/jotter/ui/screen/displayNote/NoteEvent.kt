package com.niiadotei.jotter.ui.screen.displayNote

import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.util.NoteOrder

sealed class NoteEvent {
    data class Order(val noteOrder: NoteOrder) : NoteEvent()

    data class DeleteNote(val note: Note) : NoteEvent()

    object RestoreNote : NoteEvent()

    object ToggleOrderSelection : NoteEvent()
}

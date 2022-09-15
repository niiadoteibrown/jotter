package com.niiadotei.jotter.ui.screen.displayNote

import com.niiadotei.jotter.domain.model.Note
import com.niiadotei.jotter.domain.util.NoteOrder
import com.niiadotei.jotter.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(orderType = OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
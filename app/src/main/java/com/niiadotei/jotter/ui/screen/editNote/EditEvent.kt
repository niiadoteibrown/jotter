package com.niiadotei.jotter.ui.screen.editNote

import androidx.compose.ui.focus.FocusState

sealed class EditEvent {
    data class EnteredTitle(val value: String) : EditEvent()
    data class ChangeTitleFocus(val focusState: FocusState) : EditEvent()

    data class EnteredContent(val value: String) : EditEvent()
    data class ChangeContentFocus(val focusState: FocusState) : EditEvent()

    data class ChangeColor(val color: Int) : EditEvent()

    object SaveNote : EditEvent()
}
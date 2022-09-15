package com.niiadotei.jotter.ui.navigation

sealed class Screen(val route: String) {
    object NoteScreen : Screen(route = "note_screen")

    object EditNoteScreen : Screen(route = "edit_note_screen")
}

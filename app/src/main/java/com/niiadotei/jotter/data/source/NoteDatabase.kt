package com.niiadotei.jotter.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.niiadotei.jotter.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "jotter_db"
    }

}
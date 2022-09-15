package com.niiadotei.jotter.dependencies

import android.app.Application
import androidx.room.Room
import com.niiadotei.jotter.data.repository.NoteRepositoryImpl
import com.niiadotei.jotter.data.source.NoteDatabase
import com.niiadotei.jotter.domain.feature.NoteFeature
import com.niiadotei.jotter.domain.repository.NoteRepository
import com.niiadotei.jotter.domain.useCase.DeleteNote
import com.niiadotei.jotter.domain.useCase.GetNotes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(application: Application) : NoteDatabase {
        return Room.databaseBuilder(
            application,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase) : NoteRepository {
        return NoteRepositoryImpl(database.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteFeature(repository: NoteRepository) : NoteFeature {
        return NoteFeature(
            getNotes = GetNotes(noteRepository = repository),
            deleteNote = DeleteNote(noteRepository = repository)
        )
    }
}
package com.zanahtech.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zanahtech.notesapp.database.NoteDatabase
import com.zanahtech.notesapp.repository.NoteRepository

class NoteViewModelFactory(val app: Application, private val noteRepository: NoteRepository) : ViewModelProvider.Factory {

    lateinit var noteViewModel: NoteViewModel
    override  fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, noteRepository ) as T
    }


}


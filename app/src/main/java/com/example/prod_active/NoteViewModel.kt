package com.example.prod_active

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class NoteViewModel(private val repository: NoteRepository) : ViewModel() {
    val allNotes: LiveData<List<NoteModel>> = repository.allNotes
    fun insert(note: NoteModel) {
        repository.insert(note)
    }

    fun update(note: NoteModel) {
        repository.update(note)
    }

    fun delete(note: NoteModel) {
        repository.delete(note)
    }
}
package com.example.prod_active

import androidx.lifecycle.LiveData


class NoteRepository(private val noteDao: NoteDao) {
    val allNotes: LiveData<List<NoteModel>> = noteDao.getAllNotes()

    fun insert(note: NoteModel) {
        noteDao.insert(note)
    }

    fun update(note: NoteModel) {
        noteDao.update(note)
    }

    fun delete(note: NoteModel) {
        noteDao.delete(note)
    }
}
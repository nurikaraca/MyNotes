package com.nkaraca.mynotes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.nkaraca.mynotes.model.Note;
import com.nkaraca.mynotes.repository.NoteRepository;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(Long id) {
        return noteRepository.findById(id);
    }

    public Note createOrUpdateNote(Note note) {
        return noteRepository.save(note);
    }

    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

}

/*
 * 
 * 
 * public Optional<Note> getNoteById(Long id) {
 * return noteRepository.findById(id);
 * }
 * 
 * public Note createOrUpdateNote(Note note) {
 * return noteRepository.save(note);
 * }
 * 
 * public void deleteNoteById(Long id) {
 * noteRepository.deleteById(id);
 * }
 * }
 * 
 * 
 */
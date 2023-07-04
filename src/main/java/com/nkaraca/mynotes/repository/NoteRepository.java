package com.nkaraca.mynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nkaraca.mynotes.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}

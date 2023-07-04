package com.nkaraca.mynotes.exceptions;

public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException() {
        super();
    }

    public NoteNotFoundException(String message) {
        super(message);
    }

}

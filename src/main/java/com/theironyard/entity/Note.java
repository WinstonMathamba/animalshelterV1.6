package com.theironyard.entity;

/**
 * Created by katherine_celeste on 9/19/16.
 */

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="note")
public class Note {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long noteID;

    private Long animalID;

    private String noteText;

    private Date date = new Date();

    public Note() {
    }

    public Note(Long animalID, String noteText, Date date) {
        this.animalID = animalID;
        this.noteText = noteText;
        this.date = date;
    }

    public Long getAnimalID() {
        return animalID;
    }

    public void setAnimalID(Long animalID) {
        this.animalID = animalID;
    }

    public Long getNoteID() {
        return noteID;
    }

    public void setNoteID(Long noteID) {
        this.noteID = noteID;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

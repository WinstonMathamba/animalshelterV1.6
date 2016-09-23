package com.theironyard.entity;

/**
 * Created by katherine_celeste on 9/19/16.
 */

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="note")
public class Note {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long noteID;

    private String noteText;

    private Date date;

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

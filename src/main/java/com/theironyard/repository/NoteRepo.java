package com.theironyard.repository;

import com.sun.tools.javac.util.List;
import com.theironyard.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by katherine_celeste on 9/19/16.
 */
@Repository
public interface NoteRepo extends JpaRepository <Note, Long> {

    List<Note> findAll();
}

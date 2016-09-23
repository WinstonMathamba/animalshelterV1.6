package com.theironyard.repository;

import com.theironyard.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by katherine_celeste on 9/19/16.
 */
public interface NoteRepo extends JpaRepository <Note, Long> {
}

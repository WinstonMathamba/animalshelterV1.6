package com.theironyard.repository;

import com.theironyard.entity.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Type;
import java.sql.Types;

/**
 * Created by katherine_celeste on 9/19/16.
 */
public interface TypeRepo extends JpaRepository <AnimalType, Long> {
}

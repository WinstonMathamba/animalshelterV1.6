package com.theironyard.repository;

import com.theironyard.entity.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by katherine_celeste on 9/19/16.
 */
@Repository
public interface TypeRepo extends JpaRepository <AnimalType, Long> {
}

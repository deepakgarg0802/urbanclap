package com.example.urbanclap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.urbanclap.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

    List<Task> findAllByOrderByCreatedTime();
    
    @Query(value="SELECT t from Task t " + 
            "ORDER BY ((t.latitude- :userLat)*(t.latitude-:userLat)) + ((t.longitude - :userLng)*(t.longitude - :userLng)) ASC")
    List<Task> findAllOrderByLoc(Double userLat,Double userLng);
}
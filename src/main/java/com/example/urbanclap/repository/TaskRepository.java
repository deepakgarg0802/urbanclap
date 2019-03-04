package com.example.urbanclap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.urbanclap.entities.Task;
import com.example.urbanclap.enums.TaskStatus;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    List<Task> findAllByOrderByCreatedTime();
    
    List<Task> findAllByStatusOrderByCreatedTime(TaskStatus status);
    
    @Query(value="SELECT t from Task t " + 
            "ORDER BY ((t.latitude- :userLat)*(t.latitude-:userLat)) + ((t.longitude - :userLng)*(t.longitude - :userLng)) ASC,CreatedTime")
    List<Task> findAllOrderByLoc(Double userLat,Double userLng);
}

package com.example.urbanclap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.urbanclap.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}

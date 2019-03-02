package com.example.urbanclap.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.urbanclap.enums.Category;
import com.example.urbanclap.enums.Rating;
import com.example.urbanclap.enums.TaskStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String gPlusLocation;
    private LocalDateTime dateTime;
    
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    
    private Rating rating;
}

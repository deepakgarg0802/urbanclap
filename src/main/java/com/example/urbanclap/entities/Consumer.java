package com.example.urbanclap.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.urbanclap.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "consumer_id")
    private Long id;

    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany
    private List<Task> tasksListed;

}

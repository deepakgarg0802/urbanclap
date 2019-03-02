package com.example.urbanclap.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.urbanclap.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_id")
    private Long id;

    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignedTo")
    private Set<Task> tasksAssigned=new HashSet<Task>();
}

package com.example.urbanclap.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.urbanclap.enums.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskReq {

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String location;

}

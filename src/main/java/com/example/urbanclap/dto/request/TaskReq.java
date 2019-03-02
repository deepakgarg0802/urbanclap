package com.example.urbanclap.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.urbanclap.enums.Category;
import com.example.urbanclap.enums.Rating;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskReq {

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    private Double latitiude;
    private Double longitude;
    
    private Rating rating;

}

package com.example.urbanclap.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

    COMPLETE("COMPLETE"), NEW("NEW"), ONGOING("ONGOING");

    private String name;
}

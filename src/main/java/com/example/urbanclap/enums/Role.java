package com.example.urbanclap.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    WORKER("WORKER"), CONSUMER("CONSUMER");

    private String name;
}

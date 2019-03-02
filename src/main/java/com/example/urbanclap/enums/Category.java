package com.example.urbanclap.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {

    HOME("HOME"), OTHER("OTHER");

    private String name;
}

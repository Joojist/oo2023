package com.example.kodutoo_spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Wine {
    private int id;
    private String name;
    private String grapeType;
    private int year;
    private double alcoholAmount;
    private int amount;
    private boolean active;
}

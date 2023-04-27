package com.example.kodutoo_spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Beer {
    private int id;
    private String name;
    private String type;
    private String style;
    private int year;
    private double alcoholContent;
    private double amount;
    private boolean active;
}

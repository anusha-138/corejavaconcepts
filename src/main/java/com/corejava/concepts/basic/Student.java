package com.corejava.concepts.basic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Student {
    private int id;
    private String name;

    public Student (int id,String name){
        this.id= id;
        this.name=name;
    }
}

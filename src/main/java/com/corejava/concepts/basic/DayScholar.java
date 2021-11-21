package com.corejava.concepts.basic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DayScholar extends Student{
    private String homeAddress;


    public DayScholar(int id,String name,String homeAddress) {
        super(id,name);
        this.homeAddress=homeAddress;
    }
}

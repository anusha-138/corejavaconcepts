package com.corejava.concepts.basic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hostel extends Student{
    private int roomNumber;
    public Hostel(int id,String name,int roomNumber){
        super(id,name);
        this.roomNumber=roomNumber;
    }
}

package com.toyproject.jh.jhtoyproject.cafe.dto;

import java.util.*;

public class Beverage {
    private final String name;
    private List<String> materials = new ArrayList<>();

    public Beverage(String name){
        this.name = name;
    }

    public void setMaterials(List<String> orderMaterials){
        this.materials = orderMaterials;
    }

    public String getName(){
        return this.name;
    }
}

package com.bbidag.racingcar;

public class CarName {

    private final String name;

    public CarName(String name){
        if(name == null) {
            throw new NullPointerException("차 이름은 null이면 안됩니다.");
        }
        if(name.length() > 5) {
            throw new IllegalArgumentException("차 이름은 5자를 초과하면 안됩니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

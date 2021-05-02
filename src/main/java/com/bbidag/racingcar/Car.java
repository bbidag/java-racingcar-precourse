package com.bbidag.racingcar;

public class Car {

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public void addDistanceIfCorrectNumber(int number){
        position.addDistanceIfCorrectNumber(number);
    }

    public String getName() {
        return name.getName();
    }

    public int getPositionLength() {
        return position.getLength();
    }

}

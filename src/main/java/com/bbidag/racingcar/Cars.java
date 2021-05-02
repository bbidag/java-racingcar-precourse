package com.bbidag.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private List<Car> cars;

    private Cars(){}

    private Cars(List<Car> cars){
        this.cars = cars;
    }

    public static Cars of(String names) {
        List<Car> cars = new ArrayList<>();

        for(String name : names.split(",")){
            cars.add(new Car(name));
        }

        return new Cars(cars);
    }

    public void moveEachCarByRandom(){
        Random random = new Random();
        for(Car car : cars){
            car.addDistanceIfCorrectNumber(random.nextInt(10));
        }
    }

    public int size() {
        return cars.size();
    }
}

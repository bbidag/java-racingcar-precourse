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

    public List<String> getWinPlayers(){
        List<String> winPlayers = new ArrayList<>();
        int maxDistance = 0;
        for(Car car : cars){
            maxDistance = getMaxDistance(car, maxDistance);
        }
        for(Car car : cars){
            addWinPlayerIfMaxDistance(winPlayers, car, maxDistance);
        }
        return winPlayers;
    }

    int getMaxDistance(Car car, int maxDistance){
        return car.getPositionLength() < maxDistance ? maxDistance : car.getPositionLength();
    }

    void addWinPlayerIfMaxDistance(List<String> winPlayers, Car car, int maxDistance){
        if(car.getPositionLength() == maxDistance){
            winPlayers.add(car.getName());
        }
    }

    public Iterable<Car> getCars(){
        return this.cars;
    }

    public int size() {
        return cars.size();
    }
}

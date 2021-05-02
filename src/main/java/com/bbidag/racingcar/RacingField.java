package com.bbidag.racingcar;

public class RacingField {

    private final int numberOfRound;

    public RacingField(int numberOfRound){
        this.numberOfRound = numberOfRound;
    }

    public void playGame(Cars cars){
        for(int roundIdx = 1; roundIdx <= numberOfRound; roundIdx++){
            cars.moveEachCarByRandom();
            printEachRoundCarsDistance(cars);
        }
    }

    public void printEachRoundCarsDistance(Cars cars){
        for(Car car : cars.getCars()){
            System.out.println(car.getName() + " : " + car.getPosition());
        }
        System.out.println();
    }

    public int getNumberOfRound() {
        return numberOfRound;
    }
}

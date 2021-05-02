package com.bbidag.racingcar;

import java.util.Random;

public class RacingField {

    private final int numberOfRound;

    public RacingField(int numberOfRound){
        this.numberOfRound = numberOfRound;
    }

    public void playGame(Cars cars){
        for(int roundIdx = 1; roundIdx <= numberOfRound; roundIdx++){
            cars.moveEachCarByRandom();
        }
    }

    public void printEachRoundCarsDistance(){
    }

    public int getNumberOfRound() {
        return numberOfRound;
    }
}

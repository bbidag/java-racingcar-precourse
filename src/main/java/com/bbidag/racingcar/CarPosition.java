package com.bbidag.racingcar;

public class CarPosition {

    private StringBuilder position;

    public CarPosition(){
        this.position = new StringBuilder();
    }

    public void addDistanceIfCorrectNumber(int number){
        if(isCorrectAddDistanceNumber(number)){
            addDistance();
        }
    }

    private boolean isCorrectAddDistanceNumber(int number){
        return number >= 4 && number < 10 ? true : false;
    }

    private void addDistance(){
        position.append("-");
    }

    public String getPosition(){
        return position.toString();
    }

    public int getLength(){
        return position.length();
    }

}

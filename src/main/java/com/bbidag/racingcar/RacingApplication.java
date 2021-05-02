package com.bbidag.racingcar;

import java.util.Scanner;

public class RacingApplication {

    public static void main(String[] args){

    }

    public static String initRacingCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

}

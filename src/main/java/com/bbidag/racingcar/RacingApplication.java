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

    public static RacingField initNumberOfProgress(){
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scan = new Scanner(System.in);
        int totalCount = Integer.parseInt(scan.nextLine());
        return new RacingField(totalCount);
    }

    public static void printGameResult(){
    }

}

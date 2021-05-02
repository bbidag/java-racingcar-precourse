package com.bbidag.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc,bcd,e","test1,test2"})
    @DisplayName("차 리스트 생성 테스트")
    public void createCars(String names){
        Cars cars = Cars.of(names);
        assertThat(cars.size()).isEqualTo(names.split(",").length);
    }

    @Test
    @DisplayName("차와 최대 이동 거리 중 최대 이동거리가 더 길면 최대 이동거리를 출력한다.")
    public void getMaxDistanceIfMoreThanCarPosition(){
        Cars cars = Cars.of("a");
        Car car = cars.getCars().iterator().next();
        car.addDistanceIfCorrectNumber(5);
        car.addDistanceIfCorrectNumber(5);
        assertThat(cars.getMaxDistance(car, 5)).isEqualTo(5);
    }

    @Test
    @DisplayName("차와 최대 이동 거리 중 차의 이동 거리가 더 길면 차의 이동거리를 출력한다.")
    public void getMaxDistanceIfLessThanCarPosition(){
        Cars cars = Cars.of("a");
        Car car = cars.getCars().iterator().next();
        car.addDistanceIfCorrectNumber(5);
        car.addDistanceIfCorrectNumber(5);
        assertThat(cars.getMaxDistance(car, 2)).isEqualTo(3);
    }

    @Test
    @DisplayName("승리자와 최대 이동거리가 입력된 경우 승리자가 포함되는지 테스트")
    public void addWinPlayerIfMaxDistance(){
        Cars cars = Cars.of("a");
        Car car = cars.getCars().iterator().next();
        car.addDistanceIfCorrectNumber(6);
        car.addDistanceIfCorrectNumber(6);
        List<String> winPlayers = new ArrayList<>();
        cars.addWinPlayerIfMaxDistance(winPlayers, car, 3);
        assertThat(winPlayers.contains("a")).isTrue();
    }

}

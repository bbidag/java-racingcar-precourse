package com.bbidag.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @ParameterizedTest
    @ValueSource(strings = {"abc,bcd,e","test1,test2"})
    @DisplayName("차 리스트 생성 테스트")
    public void createCars(String names){
        Cars cars = Cars.of(names);
        assertThat(cars.size()).isEqualTo(names.split(",").length);
    }

}

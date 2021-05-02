package com.bbidag.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("차 하나 생성 테스트")
    public void createCar(){
        assertThat(new Car("bidag")).isNotNull();
    }

}

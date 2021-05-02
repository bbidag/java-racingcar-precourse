package com.bbidag.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarPositionTest {

    @ParameterizedTest
    @ValueSource(ints = {4,7,9})
    @DisplayName("차가 이동할 수 있는 값이 입력되면 차를 전진시킨다.")
    public void addDistanceCarPosition(int count){
        CarPosition position = new CarPosition();
        assertThat(position.getLength()).isEqualTo(1);
        position.addDistanceIfCorrectNumber(count);
        assertThat(position.getLength()).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,3})
    @DisplayName("차가 이동할 수 없는 값이 입력되면 차의 위치는 움직이지 않는다.")
    public void noAddDistanceCarPosition(int count){
        CarPosition position = new CarPosition();
        assertThat(position.getLength()).isEqualTo(1);
        position.addDistanceIfCorrectNumber(count);
        assertThat(position.getLength()).isEqualTo(1);
    }

}

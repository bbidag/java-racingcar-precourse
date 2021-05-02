package com.bbidag.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"ab","cagew","vevf","a","bfe"})
    @DisplayName("차 이름이 5자 이하인 경우 생성이 잘 되는지 테스트")
    public void successCreationNameWithValidation(String name){
        assertThat(new CarName(name)).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(strings = {"tooLongName","string"})
    public void failCreationNameWithValidation(String name){
        assertThrows(IllegalArgumentException.class, () -> {
            new CarName(name);
        });
    }

    @Test
    @DisplayName("차 이름이 null로 입력되는 경우 테스트")
    public void failCreationNullName(){
        assertThrows(NullPointerException.class, () ->{
            new CarName(null);
        });
    }

}

package com.bbidag.racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingFieldTest {

    @Test
    public void getNumberOfProgress(){
        assertThat(new RacingField(5).getNumberOfProgress()).isEqualTo(5);
    }

}

package com.rnwnsgud.momstouch.domain.hamburger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Beverage {

    PEPSI("펩시콜라", 1600, 0),
    PEPSI_ZERO("펩시콜라제로", 1600, 0),
    CHILSUNG("칠성사이다", 1600, 0),
    CHILSUNG_ZERO("칠성사이다제로", 1600, 0);




    private String name;
    private int price;
    private int extraFee;
}

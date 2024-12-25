package com.rnwnsgud.momstouch.domain.hamburger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Side {

    NO_SELECTION("선택없음", 0, 0),
    FRIED_POTATOES_MEDIUM("케이준양념감자(중)", 2100, 0),
    FRIED_POTATOES_LARGE("케이준양념감자(대)", 3600, 1400);

    private String name;
    private int price;
    private int extraFee;
}

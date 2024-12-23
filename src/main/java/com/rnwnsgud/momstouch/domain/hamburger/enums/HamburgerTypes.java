package com.rnwnsgud.momstouch.domain.hamburger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HamburgerTypes {

    FILLET("휠렛버거", PattyTypes.FILLET, 5000, 7400),
    THIGH("싸이버거", PattyTypes.THIGH, 4900, 7300),
    BULGOGI("불고기버거", PattyTypes.BULGOGI, 4200, 6600),
    SHRIMP("통새우버거", PattyTypes.SHRIMP, 3800, 6200),
    GRILLED_BEEF("그릴드비프", PattyTypes.BEEF, 5400, 7800);

    private String name;
    private PattyTypes patty;
    private int price;
    private int mealPrice;
}

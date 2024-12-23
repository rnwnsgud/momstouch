package com.rnwnsgud.momstouch.domain.hamburger.model;

import com.rnwnsgud.momstouch.domain.hamburger.enums.MenuOptions;
import com.rnwnsgud.momstouch.domain.menu.model.Menu;
import com.rnwnsgud.momstouch.domain.hamburger.enums.HamburgerTypes;
import com.rnwnsgud.momstouch.domain.menu.enums.MenuTypes;
import lombok.Getter;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
public class Hamburger extends Menu {

    private final HamburgerTypes hamburgerTypes;
    private final MenuOptions menuOptions;

    public static Hamburger of(HamburgerTypes hamburgerTypes, MenuOptions menuOptions) {
        return Hamburger.builder()
                .name(hamburgerTypes.getName())
                .price(menuOptions.calculatePrice(hamburgerTypes))
                .menuTypes(MenuTypes.HAMBURGER)
                .hamburgerTypes(hamburgerTypes)
                .menuOptions(menuOptions)
                .build();
    }

}




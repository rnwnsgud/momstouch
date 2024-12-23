package com.rnwnsgud.momstouch.domain.menu.model;

import com.rnwnsgud.momstouch.domain.menu.enums.MenuTypes;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Menu {

    private final Long id;
    private final String name;
    private final int price;
    private final MenuTypes menuTypes;

}

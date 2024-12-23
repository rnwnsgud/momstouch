package com.rnwnsgud.momstouch.domain.kiosk.model;

import com.rnwnsgud.momstouch.domain.hamburger.infrastructure.HamburgerEntity;
import com.rnwnsgud.momstouch.domain.menu.model.Menu;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Kiosk {

    private final List<Menu> menus = new ArrayList<>();

    public void add(Menu menu) {
        menus.add(menu);
    }

    public static void main(String[] args) {

    }


}

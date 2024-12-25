package com.rnwnsgud.momstouch.domain.kiosk.model;

import com.rnwnsgud.momstouch.domain.menu.model.Menu;
import com.rnwnsgud.momstouch.exception.CoreException;
import lombok.Getter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.rnwnsgud.momstouch.exception.ErrorCode.WRONG_KIOSK_COUNT;

@Getter // TODO : 동시성 생각
public class Kiosk {

    public static final LocalTime SHOP_OPEN_TIME = LocalTime.of(11, 0);
    public static final LocalTime SHOP_CLOSE_TIME = LocalTime.of(8, 40);

    private final List<Menu> menus = new ArrayList<>();
    private int totalPrice;

    public void add(Menu menu) {
        menus.add(menu);
        totalPrice += menu.getPrice();
    }

    public void add(Menu menu, int count) {
        if (count <= 0) throw new CoreException(WRONG_KIOSK_COUNT);
        for (int i = 0; i < count; i++) {
            menus.add(menu);
        }
        totalPrice += menu.getPrice()*count;
    }




}

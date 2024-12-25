package com.rnwnsgud.momstouch.domain.kiosk.model;

import com.rnwnsgud.momstouch.domain.hamburger.enums.HamburgerTypes;
import com.rnwnsgud.momstouch.domain.hamburger.enums.MenuOptions;
import com.rnwnsgud.momstouch.domain.hamburger.enums.Side;
import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;
import com.rnwnsgud.momstouch.exception.CoreException;
import com.rnwnsgud.momstouch.exception.ErrorCode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class KioskTest {

    @DisplayName("키오스크에 메뉴를 추가할 수 있다.")
    @Test
    void add() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST, Side.FRIED_POTATOES_MEDIUM, Side.NO_SELECTION);
        Kiosk kiosk = new Kiosk();
        // when
        kiosk.add(hamburger);
        // then
        assertThat(kiosk.getMenus().size()).isEqualTo(1);
        assertThat(kiosk.getMenus().get(0)).isEqualTo(hamburger);
    }

    @DisplayName("키오스크에 메뉴를 여러번 추가할 수 있다.")
    @Test
    void addSeveral() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST, Side.FRIED_POTATOES_MEDIUM, Side.NO_SELECTION);
        Hamburger hamburger2 = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST, Side.FRIED_POTATOES_LARGE, Side.FRIED_POTATOES_LARGE);
        int totalPrice = hamburger.getPrice() + hamburger2.getPrice();
        Kiosk kiosk = new Kiosk();
        // when
        kiosk.add(hamburger);
        kiosk.add(hamburger2);
        // then
        assertThat(kiosk.getMenus().size()).isEqualTo(2);
        assertThat(kiosk.getMenus().size()).isEqualTo(2);
        assertThat(kiosk.getTotalPrice()).isEqualTo(totalPrice);
    }

    @DisplayName("키오스크에 메뉴를 수량만큼 추가할 수 있다.")
    @Test
    void addCount() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST, Side.FRIED_POTATOES_MEDIUM, Side.NO_SELECTION);
        Kiosk kiosk = new Kiosk();
        // when
        kiosk.add(hamburger, 2);
        // then
        assertThat(kiosk.getMenus().size()).isEqualTo(2);
        assertThat(kiosk.getTotalPrice()).isEqualTo(hamburger.getPrice()*2);
    }

    @DisplayName("키오스크에 메뉴를 0이하의 수량만큼 추가하면 예외를 던진다.")
    @Test
    void addCountZero() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST, Side.FRIED_POTATOES_MEDIUM, Side.NO_SELECTION);
        Kiosk kiosk = new Kiosk();
        // when
        // then
        assertThatThrownBy(() -> kiosk.add(hamburger, 0))
                .isInstanceOf(CoreException.class)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.WRONG_KIOSK_COUNT);
    }
}
package com.rnwnsgud.momstouch.domain.kiosk.model;

import com.rnwnsgud.momstouch.domain.hamburger.enums.HamburgerTypes;
import com.rnwnsgud.momstouch.domain.hamburger.enums.MenuOptions;
import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class KioskTest {

    @DisplayName("키오스크에 메뉴 한개를 추가할 수 있다.")
    @Test
    void add() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST);
        Kiosk kiosk = new Kiosk();
        // when
        kiosk.add(hamburger);
        // then
        assertThat(kiosk.getMenus().size()).isEqualTo(1);
        assertThat(kiosk.getMenus().get(0)).isEqualTo(hamburger);
    }
}
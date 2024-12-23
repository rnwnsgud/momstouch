package com.rnwnsgud.momstouch.domain.hamburger.infrastructure;

import com.rnwnsgud.momstouch.domain.hamburger.enums.HamburgerTypes;
import com.rnwnsgud.momstouch.domain.hamburger.enums.MenuOptions;
import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class HamburgerRepositoryTest {

    @Autowired
    private HamburgerRepository hamburgerRepository;

    @DisplayName("save()")
    @Test
    void save() {
        // given
        Hamburger hamburger = Hamburger.of(HamburgerTypes.BULGOGI, MenuOptions.JUST);
        // when
        Hamburger savedHamburger = hamburgerRepository.save(hamburger);
        // then
        Assertions.assertThat(savedHamburger.getHamburgerTypes()).isEqualTo(HamburgerTypes.BULGOGI);
    }
}
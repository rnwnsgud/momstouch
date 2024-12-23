package com.rnwnsgud.momstouch.domain.hamburger.infrastructure;

import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;

public interface HamburgerRepository {

    Hamburger save(Hamburger hamburger);
}

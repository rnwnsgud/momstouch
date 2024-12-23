package com.rnwnsgud.momstouch.domain.hamburger.enums;

public enum MenuOptions {
    JUST {
        @Override
        public int calculatePrice(HamburgerTypes hamburgerTypes) {
            return hamburgerTypes.getPrice();
        }
    },

    MEAL {
        @Override
        public int calculatePrice(HamburgerTypes hamburgerTypes) {
            return hamburgerTypes.getMealPrice();
        }
    };

    public abstract int calculatePrice(HamburgerTypes hamburgerTypes);
}

package com.rnwnsgud.momstouch.domain.hamburger.enums;

public enum MenuOptions {
    JUST {
        @Override
        public int calculatePrice(HamburgerTypes hamburgerTypes, Side side, Side addition) {
            return hamburgerTypes.getPrice() + addition.getPrice();
        }

    },

    MEAL {
        @Override
        public int calculatePrice(HamburgerTypes hamburgerTypes, Side side, Side addition) {
            return hamburgerTypes.getMealPrice() + side.getExtraFee() + addition.getPrice();
        }

    };

    public abstract int calculatePrice(HamburgerTypes hamburgerTypes, Side side, Side addition);
}

package com.rnwnsgud.momstouch.domain.hamburger.infrastructure;

import com.rnwnsgud.momstouch.domain.hamburger.enums.HamburgerTypes;
import com.rnwnsgud.momstouch.domain.hamburger.enums.MenuOptions;
import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;
import com.rnwnsgud.momstouch.domain.menu.enums.MenuTypes;
import com.rnwnsgud.momstouch.domain.menu.infrastructure.MenuEntity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorValue("H")
@Table(name = "Hamburgers")
@Entity
public class HamburgerEntity extends MenuEntity {

    @Enumerated
    private HamburgerTypes hamburgerTypes;
    @Enumerated
    private MenuOptions menuOptions;

    @Builder(access = AccessLevel.PRIVATE)
    private HamburgerEntity(Long id, String name, int price, MenuTypes menuTypes,
                            HamburgerTypes hamburgerTypes, MenuOptions menuOptions) {
        super(id, name, price, menuTypes);
        this.hamburgerTypes = hamburgerTypes;
        this.menuOptions = menuOptions;
    }

    public static HamburgerEntity from(Hamburger hamburger) {
        return HamburgerEntity.builder()
                .id(hamburger.getId())
                .name(hamburger.getName())
                .price(hamburger.getPrice())
                .menuTypes(MenuTypes.HAMBURGER)
                .hamburgerTypes(hamburger.getHamburgerTypes())
                .menuOptions(hamburger.getMenuOptions())
                .build();

    }

    public Hamburger toModel() {
        return Hamburger.builder()
                .id(getId())
                .name(getName())
                .price(getPrice())
                .menuTypes(MenuTypes.HAMBURGER)
                .hamburgerTypes(hamburgerTypes)
                .menuOptions(menuOptions)
                .build();
    }
}

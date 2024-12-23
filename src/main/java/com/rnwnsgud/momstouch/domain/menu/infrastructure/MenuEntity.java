package com.rnwnsgud.momstouch.domain.menu.infrastructure;

import com.rnwnsgud.momstouch.domain.menu.enums.MenuTypes;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Menus")
@Entity
public abstract class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    @Enumerated(value = EnumType.STRING)
    private MenuTypes menuTypes;


    protected MenuEntity(Long id, String name, int price, MenuTypes menuTypes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.menuTypes = menuTypes;
    }
}

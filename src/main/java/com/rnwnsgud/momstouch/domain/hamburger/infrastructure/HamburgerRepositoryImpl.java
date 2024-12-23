package com.rnwnsgud.momstouch.domain.hamburger.infrastructure;

import com.rnwnsgud.momstouch.domain.hamburger.model.Hamburger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HamburgerRepositoryImpl implements HamburgerRepository{

    private final HamburgerJpaRepository hamburgerJpaRepository;

    @Override
    public Hamburger save(Hamburger hamburger) {
        return hamburgerJpaRepository.save(HamburgerEntity.from(hamburger)).toModel();
    }
}

package com.cmpe133.spacewiki.repository;

import com.cmpe133.spacewiki.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
}

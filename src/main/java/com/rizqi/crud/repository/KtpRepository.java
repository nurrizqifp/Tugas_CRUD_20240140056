package com.rizqi.crud.repository;

import com.rizqi.crud.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    Optional<Ktp> findByNomorKtp(String nomorKtp);
    boolean existsByNomorKtp(String nomorKtp);
}
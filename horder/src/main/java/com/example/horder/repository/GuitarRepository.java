package com.example.horder.repository;

import com.example.horder.models.Guitar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends JpaRepository<Guitar, Long> {
    public Page<Guitar> findAll(Pageable pageable);
}

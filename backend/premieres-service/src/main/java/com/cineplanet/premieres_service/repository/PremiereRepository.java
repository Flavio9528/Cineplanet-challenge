package com.cineplanet.premieres_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cineplanet.premieres_service.model.Premiere;

@Repository
public interface PremiereRepository extends JpaRepository<Premiere, Long> {

    @Query(value = "CALL get_premieres()", nativeQuery = true)
    List<Premiere> getPremieres();
}

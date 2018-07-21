package com.ilirkosumi.domain.repository;

import com.ilirkosumi.domain.Garage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends JpaRepository<Garage, Long> {

}

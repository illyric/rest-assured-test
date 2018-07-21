package com.ilirkosumi.domain.repository;

import com.ilirkosumi.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}

package com.cakes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.CakesEntity;

public interface CakesRepository extends JpaRepository<CakesEntity, Integer> {

}

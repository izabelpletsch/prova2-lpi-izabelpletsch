package com.izabelprova.cidades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izabelprova.cidades.entities.City;

public interface CityRepository extends JpaRepository<City,Integer> {
  
}

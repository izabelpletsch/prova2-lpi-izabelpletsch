package com.izabelprova.cidades.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izabelprova.cidades.dto.CityResponse;
import com.izabelprova.cidades.entities.City;
import com.izabelprova.cidades.mappers.CityMapper;
import com.izabelprova.cidades.repositories.CityRepository;

@Service
public class CityService {
  @Autowired
  private CityRepository cityRepository;

  public List<CityResponse> getCities() {
    List<City> cities = cityRepository.findAll();

    return cities
        .stream()
        .map(city -> CityMapper.toDTO(city))
        .collect(Collectors.toList());
  }
}

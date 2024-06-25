package com.izabelprova.cidades.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izabelprova.cidades.dto.CityRequest;
import com.izabelprova.cidades.dto.CityResponse;
import com.izabelprova.cidades.entities.City;
import com.izabelprova.cidades.mappers.CityMapper;
import com.izabelprova.cidades.repositories.CityRepository;

import jakarta.persistence.EntityNotFoundException;

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

  public CityResponse getCityById(int id) {
    City city = cityRepository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Cidade não encontrada"));

    return CityMapper.toDTO(city);
  }

  public CityResponse update(int id, CityRequest requestCity) {
    try {
      City city = cityRepository.getReferenceById(id);

      city.setNome(Optional.ofNullable(requestCity.nome()).orElse(city.getNome()));
      city.setEstado(Optional.ofNullable(requestCity.estado()).orElse(city.getEstado()));
      city.setPopulacao(Optional.ofNullable(requestCity.populacao()).orElse(city.getPopulacao()));
      city.setPib(Optional.ofNullable(requestCity.pib()).orElse(city.getPib()));
      cityRepository.save(city);

      return CityMapper.toDTO(city);
    } catch (EntityNotFoundException e) {
      throw new EntityNotFoundException("Cidade não cadastrada");
    }
  }

  public void deleteCityById(int id) {
    if(this.cityRepository.existsById(id)) {
      this.cityRepository.deleteById(id);
    } else {
      throw new EntityNotFoundException("Cidade não cadastrada");
    }
  }
}

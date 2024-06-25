package com.izabelprova.cidades.mappers;

import com.izabelprova.cidades.dto.CityRequest;
import com.izabelprova.cidades.dto.CityResponse;
import com.izabelprova.cidades.entities.City;

public class CityMapper {
  public static City toEntity(CityRequest request) {
    City city = new City();
    city.setNome(request.nome());
    city.setEstado(request.estado());
    city.setPopulacao(request.populacao());
    city.setPib(request.pib());
    return city;
  }

  public static CityResponse toDTO(City city) {

    return new CityResponse(city.getId(),
        city.getNome(),
        city.getEstado(),
        city.getPopulacao(),
        city.getPib());

  }

}
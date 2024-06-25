package com.izabelprova.cidades.dto;

import jakarta.validation.constraints.NotNull;

public record CityRequest(
  @NotNull(message = "Nome não pode ser nulo")
  String nome, 
  @NotNull(message = "Estado não pode ser nulo")
  String estado, 
  @NotNull(message = "População não pode ser nulo")
  Double populacao, 
  @NotNull(message = "PIB não pode ser nulo")
  Double pib) {

}

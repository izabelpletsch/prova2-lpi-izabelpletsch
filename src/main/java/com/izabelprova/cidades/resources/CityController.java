package com.izabelprova.cidades.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izabelprova.cidades.dto.CityResponse;
import com.izabelprova.cidades.services.CityService;

@RestController
@RequestMapping("cities")
public class CityController {
  @Autowired
  private CityService cityService;

  @GetMapping
  public ResponseEntity<List<CityResponse>> getCities() {
    return ResponseEntity.ok(this.cityService.getCities());
  }
}

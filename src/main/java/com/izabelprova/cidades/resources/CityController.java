package com.izabelprova.cidades.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izabelprova.cidades.dto.CityRequest;
import com.izabelprova.cidades.dto.CityResponse;
import com.izabelprova.cidades.services.CityService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("cities")
public class CityController {
  @Autowired
  private CityService cityService;

  @GetMapping
  public ResponseEntity<List<CityResponse>> getCities() {
    return ResponseEntity.ok(this.cityService.getCities());
  }

  @GetMapping("{id}")
  public ResponseEntity<CityResponse> getCityById(@PathVariable int id) {
    return ResponseEntity.ok(this.cityService.getCityById(id));
  }
  
  @PutMapping("{id}")
  public ResponseEntity<Void> updateCity(@PathVariable int id, @RequestBody CityRequest city) {
    this.cityService.update(id, city);
    return ResponseEntity.ok().build();
  }
}

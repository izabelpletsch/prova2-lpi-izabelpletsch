package com.izabelprova.cidades.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CIDADES_TBL")
public class City {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @Column(nullable = false)
  String nome;

  @Column(nullable = false)
  String estado;

  @Column(nullable = false)
  Double populacao;

  @Column(nullable = false)
  Double pib;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public Double getPopulacao() {
    return populacao;
  }
  public void setPopulacao(Double populacao) {
    this.populacao = populacao;
  }
  public Double getPib() {
    return pib;
  }
  public void setPib(Double pib) {
    this.pib = pib;
  }


}

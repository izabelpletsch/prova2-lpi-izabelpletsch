package com.izabelprova.cidades.entities;

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

  String nome;
  String estado;
  Double populacao;
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
  public String getPopulacao() {
    return populacao;
  }
  public void setPopulacao(String populacao) {
    this.populacao = populacao;
  }
  public String getPib() {
    return pib;
  }
  public void setPib(String pib) {
    this.pib = pib;
  }


}

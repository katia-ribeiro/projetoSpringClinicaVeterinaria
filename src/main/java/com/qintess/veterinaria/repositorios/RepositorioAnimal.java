package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Animais;

public interface RepositorioAnimal extends CrudRepository<Animais, Integer> {


}

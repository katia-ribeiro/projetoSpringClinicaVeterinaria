package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Animais;
import com.qintess.veterinaria.model.Especialidades;

public interface RepositorioEspecialidades extends CrudRepository<Especialidades, Integer> {


}

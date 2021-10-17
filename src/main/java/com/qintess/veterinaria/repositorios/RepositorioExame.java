package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Exames;

public interface RepositorioExame  extends CrudRepository<Exames, Integer> {

}

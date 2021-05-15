package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Funcionarios;

public interface RepositorioExame  extends CrudRepository<Funcionarios, Integer> {

}

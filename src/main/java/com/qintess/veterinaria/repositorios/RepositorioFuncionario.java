package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Funcionarios;


public interface RepositorioFuncionario  extends CrudRepository<Funcionarios, Integer> {

}

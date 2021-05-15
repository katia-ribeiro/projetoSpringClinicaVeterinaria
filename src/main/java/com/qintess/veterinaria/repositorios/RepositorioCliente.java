package com.qintess.veterinaria.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.qintess.veterinaria.model.Clientes;


public interface RepositorioCliente extends CrudRepository<Clientes, Integer> {

}

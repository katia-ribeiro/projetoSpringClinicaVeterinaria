package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qintess.veterinaria.repositorios.RepositorioCliente;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerCliente {
	
	@Autowired
	private  RepositorioCliente rc;
	
	@RequestMapping(value="/cadastrarCliente",method= RequestMethod.GET)
	public String cliente() {
		
		return "cadastroCliente/CadastroCliente";
	}
}



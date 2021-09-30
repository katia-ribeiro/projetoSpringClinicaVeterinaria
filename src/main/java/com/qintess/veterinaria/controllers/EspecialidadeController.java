package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qintess.veterinaria.repositorios.RepositorioEspecialidades;

@Controller
public class EspecialidadeController {
	@Autowired
	private  RepositorioEspecialidades res;
	
	@RequestMapping(value="/cadastrarEspecialidades",method= RequestMethod.GET)
	public String cliente() {
		
		return "cadastroEspecialidades/especialidades";
	}
}

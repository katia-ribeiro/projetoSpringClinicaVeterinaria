package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qintess.veterinaria.model.Exames;
import com.qintess.veterinaria.repositorios.RepositorioExame;

@Controller
public class ExameController {
	
	@Autowired
	private  RepositorioExame re;
	
	@RequestMapping(value="/cadastrarExame",method= RequestMethod.GET)
	public String exame() {
		
		return "cadstroExames/exames";
	}
	@RequestMapping(value="/cadastrarExame",method= RequestMethod.POST)
	public String exames(Exames examex) {
		re.save(examex);
		
		return "cadstroExames/exames";
}
}



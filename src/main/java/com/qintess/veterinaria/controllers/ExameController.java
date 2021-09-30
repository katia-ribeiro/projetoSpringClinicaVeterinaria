package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qintess.veterinaria.repositorios.RepositorioExame;

@Controller
public class ExameController {
	
	@Autowired
	private  RepositorioExame re;
	
	@RequestMapping(value="/cadastrarExame",method= RequestMethod.GET)
	public String cliente() {
		
		return "cadstroExames/exames";
	}
}



package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qintess.veterinaria.repositorios.RepositorioTratamento;

@Controller
public class TratamentoController {
	

	@Autowired
	private  RepositorioTratamento rt;
	
	@RequestMapping(value="/cadastrarTratamento",method= RequestMethod.GET)
	public String cliente() {
		
		return "cadastroTratamento/tratamento";
	}
}



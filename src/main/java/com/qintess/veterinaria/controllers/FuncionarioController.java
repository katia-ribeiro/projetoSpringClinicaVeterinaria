package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qintess.veterinaria.repositorios.RepositorioFuncionario;

@Controller
public class FuncionarioController {
	
		@Autowired
		private  RepositorioFuncionario rf;
		
		@RequestMapping(value="/cadastrarFuncionario",method= RequestMethod.GET)
		public String cliente() {
			
			return "cadastroFuncionario/cadastroFuncionario";
		}
	}




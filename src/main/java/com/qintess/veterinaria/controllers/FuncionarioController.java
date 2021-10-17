package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.qintess.veterinaria.model.Funcionarios;
import com.qintess.veterinaria.repositorios.RepositorioFuncionario;

@Controller
public class FuncionarioController {
	
		@Autowired
		private  RepositorioFuncionario rf;
		
		@RequestMapping(value="/cadastrarFuncionario",method= RequestMethod.GET)
		public String cliente() {
			return "cadastroFuncionario/cadastroFuncionario";
		}
		
		@RequestMapping(value="/cadastrarFuncionario",method= RequestMethod.POST)
		public String cadastrocliente(Funcionarios funcionarios) {
			rf.save(funcionarios);
			return "cadastroFuncionario/cadastroFuncionario";
	}
}


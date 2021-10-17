package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qintess.veterinaria.model.Clientes;
import com.qintess.veterinaria.repositorios.RepositorioCliente;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerCliente {
	
	@Autowired
	private  RepositorioCliente rc;
	
	@RequestMapping(value="/cadastrarCliente",method= RequestMethod.GET)
	public String cliente() {
		
		return "cadastroCliente/CadastroCliente";
	}
	@RequestMapping(value="/cadastrarCliente",method= RequestMethod.POST)
	public String form(Clientes cliente) {	
	rc.save(cliente);
	System.out.println(cliente);
		return "redirect:cadastrarCliente";
	}
	
	@RequestMapping(value="/listaClientes")
	public ModelAndView listaClites() {
		ModelAndView mv = new ModelAndView("cadastroCliente/CadastroCliente");
			Iterable<Clientes> cliente = rc.findAll();
			mv.addObject("clientes", cliente);
			System.out.println(cliente);
			return mv;
		
	}

}

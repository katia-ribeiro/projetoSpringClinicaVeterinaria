package com.qintess.veterinaria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContatoController {
	@RequestMapping(value="/contato",method= RequestMethod.GET)
	public String cliente() {
		
		return "contatos/contatos";


}
}
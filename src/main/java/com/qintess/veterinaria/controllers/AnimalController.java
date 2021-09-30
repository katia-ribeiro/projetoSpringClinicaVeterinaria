package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qintess.veterinaria.repositorios.RepositorioAnimal;

@Controller
public class AnimalController {
	
		@Autowired
		private  RepositorioAnimal ra;
		
		@RequestMapping(value="/cadastrarAnimal",method= RequestMethod.GET)
		public String cliente() {
			
			return "cadastroPets/pets";
		}
	}




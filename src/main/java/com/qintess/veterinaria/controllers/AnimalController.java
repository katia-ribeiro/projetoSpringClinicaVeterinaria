package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.qintess.veterinaria.model.Animais;
import com.qintess.veterinaria.repositorios.RepositorioAnimal;
@Controller
public class AnimalController {
	
		@Autowired
		private  RepositorioAnimal ra;
		
		@RequestMapping(value="/cadastrarAnimal",method= RequestMethod.GET)
		public String animal() {
			
			return "cadastroPets/pets";
		}
		@RequestMapping(value="/cadastrarAnimal",method= RequestMethod.POST)
		public String animais(Animais animaiss) {
			ra.save(animaiss);
			return "redirect:cadastrarAnimal";
	}
		@RequestMapping(value="/listaPets")
		public ModelAndView listPets() {
			ModelAndView mv = new ModelAndView("cadastrarAnimal/listaPets");
			Iterable<Animais> animais = ra.findAll();
			mv.addObject("animais", animais);
			return mv;
		}
}
		

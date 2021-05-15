package com.qintess.veterinaria.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qintess.veterinaria.Dao.Dao;
import com.qintess.veterinaria.model.Clientes;

@Controller
@RequestMapping("/cliente")
public class ControllerCliente {
	
	@Autowired
	private Dao dao;
	
	@RequestMapping("")
	public String carrega(Model model) {
		
		model.addAttribute("cliente", new Clientes());
		List<Clientes> clientes = dao.buscaTodos(Clientes.class);
		model.addAttribute("clientes", clientes);
		
		return "cliente";
	}
	
	@RequestMapping("/salva")
	public String salva(@ModelAttribute Clientes cliente,
					    RedirectAttributes redirectAtt) {
		
		try {
			if(cliente.getId() == 0) {
				dao.salva(cliente);
				redirectAtt.addFlashAttribute("mensagemSucesso", "Clientes cadastrado com sucesso!");
			}
			else {
				dao.altera(cliente);
				redirectAtt.addFlashAttribute("mensagemSucesso", "Clientes alterado com sucesso!");
			}
				
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
		}
		
		return "redirect:/cliente";
	}
	
	@RequestMapping("/altera/{id}")
	public String carregaAltera(@PathVariable("id") int id,
								Model model,
								RedirectAttributes redirectAtt) {
		try {
			model.addAttribute("cliente", dao.buscaPorId(Clientes.class, id));
			model.addAttribute("clientes", dao.buscaTodos(Clientes.class));
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("mensagemErro", "ERRO GRAVE: " + e.getMessage());
		}
		
		return "cliente";
	}
	
	@RequestMapping("/deleta/{id}")
	public String deleta(@PathVariable("id") int id,
						 RedirectAttributes redirectAtt) {
		Clientes cliente = dao.buscaPorId(Clientes.class, id);
		dao.deleta(cliente);
		redirectAtt.addFlashAttribute("mensagemSucesso", "Clientes deletado com sucesso!");
		return "redirect:/cliente";
	}

}

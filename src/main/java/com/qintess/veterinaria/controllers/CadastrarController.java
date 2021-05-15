package com.qintess.veterinaria.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qintess.veterinaria.dto.ClientesDto;
import com.qintess.veterinaria.model.Clientes;
import com.qintess.veterinaria.repositorios.RepositorioCliente;


@Controller
@RequestMapping("/usuarios")
public class CadastrarController {

	@Autowired	
	private RepositorioCliente clienteRepository;

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("cliente", new ClientesDto());
		model.addAttribute("clientes", retornaClientesDto());

		return "usuarios/novo";
	}	
	@GetMapping("/usuarios/novo")
	public String carregaIndex() {

		return "/usuarios/cadastro";
	}


	@PostMapping("/cadastra" )
	public String cadastra(ClientesDto clienteDto) {

		Clientes cliente = clienteDto.conveter();
		clienteRepository.save(cliente);
		return "redirect:/";
	}	

	private List <ClientesDto> retornaClientesDto() {
		var clienteDto = new ArrayList<ClientesDto>();
		clienteRepository.findAll().forEach(d -> {
			clienteDto.add(new ClientesDto(d));

		});

		return clienteDto;
	}

	@GetMapping("/deleta/{id}")
	public String deleta(@PathVariable int id) {
		clienteRepository.deleteById(id);
		return "redirect:/";
	}


	@GetMapping("/edita/{id}")
	public String edita(@PathVariable int id, Model model) {

		var clienteOptional = clienteRepository.findById(id);
		if(clienteOptional.isPresent()) {
			var cliente = clienteOptional.get();
			var clienteDto = new ClientesDto(cliente);
			model.addAttribute("cliente", clienteDto);
		}
		return "cliente/novo";
	}

}
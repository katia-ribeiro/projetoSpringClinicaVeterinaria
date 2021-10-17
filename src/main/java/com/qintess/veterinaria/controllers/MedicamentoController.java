package com.qintess.veterinaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qintess.veterinaria.model.Medicamentos;
import com.qintess.veterinaria.repositorios.RepositoriosMedicamentos;

@Controller
public class MedicamentoController {
	
	@Autowired
	private  RepositoriosMedicamentos rm;
	
	@RequestMapping(value="/cadastrarMedicamentos",method= RequestMethod.GET)
	public String medicamento() {
		
		return "cadastromedicamentos/medicamentos";
}
	@RequestMapping(value="/cadastrarMedicamentos",method= RequestMethod.POST)
	public String medicamentos(Medicamentos medicamentos) {
		rm.save(medicamentos);
		return "redirect:cadastrarMedicamentos";

}
}
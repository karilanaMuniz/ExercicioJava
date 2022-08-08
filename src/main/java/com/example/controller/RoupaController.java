package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aulas.repository.RoupaRepositorio;
import com.example.entidade.Roupa;

@Controller
@RequestMapping("/")
public class RoupaController {

	@Autowired
	private RoupaRepositorio Lroupa;

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/cadastraroupa")
	public String formCadastrarroupa() {
		return "cadastraroupa";

	}

	@GetMapping("/consultarroupa")
	public String formConsulta(Model model) {

		Iterable<Roupa> Rroupinhas = Lroupa.findAll();
		model.addAttribute("Rroupinhas", Rroupinhas);

		return "consultarroupa";
	}

	@GetMapping("/consultarroupa/{idroupa}")
	public String formEditar(@PathVariable("idroupa") int id, Model model) {
		Roupa roupinha = Lroupa.findById(id).get();
		System.out.println(roupinha.getModelo());
		model.addAttribute("roupinha", roupinha);

		return "edicao";

	}

	@PostMapping("/cadastraroupa")
	public String salvar(Roupa roupinha) {

		Lroupa.save(roupinha);
		return "redirect:/consultarroupa";
	}

	@GetMapping("/delete/{idroupa}")
	public String delete(@PathVariable("idroupa") int id) {
		Lroupa.deleteAll();
		return "redirect:/consultarroupa";

	}

}

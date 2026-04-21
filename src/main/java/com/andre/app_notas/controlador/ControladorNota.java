package com.andre.app_notas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.app_notas.model.Nota;
import com.andre.app_notas.repositorio.RepositorioNota;

@RestController
@RequestMapping("/notas")
public class ControladorNota {
	@Autowired
	private RepositorioNota repositorio;
	
	@GetMapping
	public List<Nota> listar() {
		return repositorio.findAll();
	}
	
	@PostMapping
	public Nota salvar(@RequestBody Nota nota) {
		return repositorio.save(nota);
	}
}

package com.andre.app_notas;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import com.andre.app_notas.model.Nota;
import com.andre.app_notas.repositorio.RepositorioNota;

@DataJpaTest
public class RepositorioNotaTeste {
	@Autowired
	private RepositorioNota repositorio;
	
	@Test
	public void salvarENotificar() {
		Nota nota = new Nota("Nota teste", "Ablublublé");
		
		Nota salva = repositorio.save(nota);
		
		assertThat(salva.getId()).isNotNull();
		assertThat(salva.getTitulo()).isEqualTo("Nota teste");
	}
}

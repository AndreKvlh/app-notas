package com.andre.app_notas;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.andre.app_notas.controlador.ControladorNota;
import com.andre.app_notas.repositorio.RepositorioNota;

@WebMvcTest(ControladorNota.class)
public class ControladorNotaTeste {
	@Autowired
	private MockMvc mockMvc;
	
	@MockitoBean
	private RepositorioNota repositorio;
	
	@Test
	public void retornaStatus200() throws Exception {
		mockMvc.perform(get("/notas")).andExpect(status().isOk());
	}
}

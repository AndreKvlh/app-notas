package com.andre.app_notas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andre.app_notas.model.Nota;

@Repository
public interface RepositorioNota extends JpaRepository<Nota, Long> {

}

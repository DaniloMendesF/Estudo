package br.com.estudo.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.estudo.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

	
}

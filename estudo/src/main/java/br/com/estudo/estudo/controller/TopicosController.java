package br.com.estudo.estudo.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.estudo.estudo.model.Curso;
import br.com.estudo.estudo.model.Topico;
import br.com.estudo.estudo.model.dto.TopicoDto;
import br.com.estudo.estudo.model.dto.TopicoRequest;
import br.com.estudo.estudo.repository.CursoRepository;
import br.com.estudo.estudo.repository.TopicoRepository;

@RestController
@RequestMapping("/topico")
public class TopicosController {

	@Autowired
	TopicoRepository repository;
	
	@Autowired
	CursoRepository cursoRepository;
	
	@GetMapping
	public List<TopicoDto> lista(String cursoNome){
		if (cursoNome == null) {
			List<Topico> topicos = repository.findAll();
			return TopicoDto.converter(topicos);
		}else {
			List<Topico> topicos = repository.findByCursoNome(cursoNome);
			return TopicoDto.converter(topicos);
		}
	}
	
	@PostMapping
	public ResponseEntity<TopicoDto> cadastrar(@RequestBody TopicoRequest topicoRequest
			,UriComponentsBuilder uriBuilder ){
		Topico topico = topicoRequest.converter(cursoRepository);
		repository.save(topico);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDto(topico));
	}
}

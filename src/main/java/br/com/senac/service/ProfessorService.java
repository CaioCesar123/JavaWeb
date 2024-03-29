package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.domain.Professor;
import br.com.senac.repository.ProfessorRepositorio;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepositorio profReposi;
	
	public List<Professor> buscaProfessor(){
		return profReposi.findAll();
	}
	public Professor SalvarProfessor(Professor professor) {
		return profReposi.save(professor);
	}

}

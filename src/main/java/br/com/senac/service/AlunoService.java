package br.com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.domain.Aluno;
import br.com.senac.repository.AlunoRepositorio;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepositorio repoAluno;
	
	public List<Aluno> buscaTodosAlunos(){
		return repoAluno.findAll();
	}
	public Aluno SalvarAluno(Aluno aluno) {
		return repoAluno.save(aluno);
	}

}

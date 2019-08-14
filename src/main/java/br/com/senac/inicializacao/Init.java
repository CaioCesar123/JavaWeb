package br.com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.domain.Aluno;
import br.com.senac.domain.Professor;
import br.com.senac.service.AlunoService;
import br.com.senac.service.ProfessorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	AlunoService alunoService;
	
	@Autowired
	ProfessorService profService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Paulo");
		alunoService.SalvarAluno(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Joao");
		alunoService.SalvarAluno(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Fernanda");
		alunoService.SalvarAluno(aluno3);
		
		Professor prof1 = new Professor();
		prof1.setProfessor("Roberto");
		profService.SalvarProfessor(prof1);
		
		Professor prof2 = new Professor();
		prof2.setProfessor("Lucas");
		profService.SalvarProfessor(prof2);
		
		Professor prof3 = new Professor();
		prof3.setProfessor("Pricila");
		profService.SalvarProfessor(prof3);
		
		
		List<Aluno> listaAlunos = alunoService.buscaTodosAlunos();
		
		for(Aluno aluno:listaAlunos) {
			System.out.println("Alunos: " + aluno.getNome());
		}
		
		List<Professor> listaProfessor = profService.buscaProfessor();
		
		for(Professor professor:listaProfessor) {
			System.out.println("Professores: " + professor.getProfessor());
		}
	}

}

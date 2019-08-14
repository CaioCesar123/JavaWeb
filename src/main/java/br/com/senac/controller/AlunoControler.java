package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.AlunoService;

@Controller
@RequestMapping("Aluno")
public class AlunoControler {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("/listarAluno")
	public ModelAndView ListarTodos() {
		ModelAndView mv = new ModelAndView("paginaListaAluno");
		mv.addObject("alunos", alunoService.buscaTodosAlunos());
		return mv;
	}

}

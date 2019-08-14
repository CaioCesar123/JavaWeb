package br.com.senac.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor implements Serializable {

	private static final long serialVersionUID = -1802821701243022043L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer Id;
	
	@Column(name="ProfessorNome")
	private String Professor;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getProfessor() {
		return Professor;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}

}

package quesitoCinco;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String cod;
	private Integer turno;
	private Integer sala;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	public Turma() {
		super();
	}
	
	public Turma(String cod, Integer turno, Integer sala) {
		super();
		this.cod = cod;
		this.turno = turno;
		this.sala = sala;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}
	
	public List<Aluno> getAluno(){
		return alunos;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
}

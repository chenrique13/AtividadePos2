package quesitoSeis;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Integer sexo;
	private String dataDeNascimento;
	private double salario;
	private int telefone;
	
	private List<Dependente> dependentes = new ArrayList<>();

	public Funcionario() {
		super();
	}

	public Funcionario(Integer matricula, String nomeCompleto, String cpf, Integer sexo, String dataDeNascimento,
			double salario, int telefone, List<Dependente> dependentes) {
		super();
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
		this.telefone = telefone;
		this.dependentes = dependentes;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}
	
	public void addDependentes(Dependente dependente) {
		dependentes.add(dependente);
	}
	
	public void removeDependentes(Dependente dependente) {
		dependentes.remove(dependente);
	}
	
}

package quesitoNove;

import java.util.Date;

public class Adocao {

	private int id;
	private Animal animal;
	private Adotante adotante;
	private Date dataAdocao;
	private Date dataDevolucao;	
	private Usuario usuario;
	
	public Adocao() {
		super();
	}

	public Adocao(int id, Animal animal, Adotante adotante, Date dataAdocao, Date dataDevolucao, Usuario usuario) {
		super();
		this.id = id;
		this.animal = animal;
		this.adotante = adotante;
		this.dataAdocao = dataAdocao;
		this.dataDevolucao = dataDevolucao;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Adotante getAdotante() {
		return adotante;
	}

	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}

	public Date getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}

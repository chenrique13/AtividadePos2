package quesitoSete;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

	private int codigo;
	private String marca;
	private String nome;
	private double motor;
	private int serie;
	
	private List<Item> itens = new ArrayList<>();

	public Modelo() {
		super();
	}

	public Modelo(int codigo, String marca, String nome, double motor, int serie, List<Item> itens) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.nome = nome;
		this.motor = motor;
		this.serie = serie;
		this.itens = itens;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void addItens(Item item) {
		itens.add(item);
	}
	
	public void removeItens(Item item) {
		itens.remove(item);
	}
	
}

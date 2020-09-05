package quesitoNove;

public class Raca {

	private int id;
	private String origem;
	private double tamanhoMax;
	private double tamanhoMin;
	private int expectativaVIda;
	private int temperamento;
	
	public Raca() {
		super();
	}

	public Raca(int id, String origem, double tamanhoMax, double tamanhoMin, int expectativaVIda, int temperamento) {
		super();
		this.id = id;
		this.origem = origem;
		this.tamanhoMax = tamanhoMax;
		this.tamanhoMin = tamanhoMin;
		this.expectativaVIda = expectativaVIda;
		this.temperamento = temperamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getTamanhoMax() {
		return tamanhoMax;
	}

	public void setTamanhoMax(double tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}

	public double getTamanhoMin() {
		return tamanhoMin;
	}

	public void setTamanhoMin(double tamanhoMin) {
		this.tamanhoMin = tamanhoMin;
	}

	public int getExpectativaVIda() {
		return expectativaVIda;
	}

	public void setExpectativaVIda(int expectativaVIda) {
		this.expectativaVIda = expectativaVIda;
	}

	public int getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(int temperamento) {
		this.temperamento = temperamento;
	}
	
}

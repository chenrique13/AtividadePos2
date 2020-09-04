package quesitoTres;

public class Terrestre extends MeioDeTransporte {

	private int qtdeRodas;
	private double potencia;
	
	public Terrestre() {
		super();
	}

	public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdeRodas, double potencia) {
		super(id, ano, modelo, carga_maxima);
		this.qtdeRodas = qtdeRodas;
		this.potencia = potencia;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public double consumo() {
		double consumo = this.getPotencia() * super.getCarga_maxima() * 100;
		return consumo;
	}

	
	
	
}

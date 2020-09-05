package quesitoDoze;

public class RelogioImpl implements Relogio{

	private String marca;
	private String tipo;
	
	public RelogioImpl() {
		super();
	}

	public RelogioImpl(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void ajustarHora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarAlarme() {
		// TODO Auto-generated method stub
		
	}
	
}

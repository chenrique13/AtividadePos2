package quesitoDoze;

public class RadioRelogio implements Radio, Relogio{
	
	private String marca;
	
	public RadioRelogio() {
		super();
	}

	public RadioRelogio(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void ajustarHora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarAlarme() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mudarEstacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}
		
}

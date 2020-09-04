package quesitoQuatro;

public class Ferramenta extends ItemDeLoja{

	private String categoria;
	private Integer serial;
	
	public Ferramenta() {
		super();
	}

	public Ferramenta(String categoria, Integer serial) {
		super();
		this.categoria = categoria;
		this.serial = serial;
	}

	public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, String categoria,
			Integer serial) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.categoria = categoria;
		this.serial = serial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	
	@Override
	public int getIdentificador() {
		return this.getSerial();
	}
	
	public void separar() {
		this.setCategoria("Outros");
	}
	
	public void separar(String valor) {
		this.setCategoria(valor);
	}

}

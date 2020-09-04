package quesitoQuatro;

public class Alimento extends ItemDeLoja{

	private Integer selo;
	
	public Alimento() {
		super();
	}

	public Alimento(Integer selo) {
		super();
		this.selo = selo;
	}

	public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.selo = selo;
	}

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}
	
	@Override
	public int getIdentificador() {
		return this.getSelo();
	}

}

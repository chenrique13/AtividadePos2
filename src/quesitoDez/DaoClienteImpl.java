package quesitoDez;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente {

	private ArrayList<Cliente> lista;
	private ConexaoImpl conexao;
	
	public DaoClienteImpl() {
		super();
	}

	public DaoClienteImpl(ArrayList<Cliente> lista, ConexaoImpl conexao) {
		super();
		this.lista = lista;
		this.conexao = conexao;
	}
	
	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}

	public ConexaoImpl getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoImpl conexao) {
		this.conexao = conexao;
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente get() {
		// TODO Auto-generated method stub
		return null;
	}

}

package quesitoDez;

import java.util.ArrayList;

public interface DaoCliente {

	public static Cliente cliente = new Cliente();

	public Cliente incluir(Cliente cliente);

	public void excluir(Integer id);

	public Cliente alterar(Cliente cliente);

	public ArrayList<Cliente> listar();

	public Cliente get();

}

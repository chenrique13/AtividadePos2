package quesitoDez;

import com.sun.jdi.connect.spi.Connection;

public interface Conexao {

	public Connection conectar();
	public void desconectar(Connection con);
	
}

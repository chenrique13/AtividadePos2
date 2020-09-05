package quesitoDez;

import com.sun.jdi.connect.spi.Connection;

public interface Conexao {

	Connection conectar();
	void desconectar(Connection con);
	
}

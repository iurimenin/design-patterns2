package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Iuri Menin on 22/09/17.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {

            String banco = System.getenv("tipoBanco");

            StringBuilder urlBanco = new StringBuilder();
            urlBanco.append("jdbc:");
            urlBanco.append(banco);
            urlBanco.append("://localhost:3306/banco");

            Connection conexao =
                    DriverManager.getConnection(urlBanco.toString(),
                            "usuario", "senha");

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

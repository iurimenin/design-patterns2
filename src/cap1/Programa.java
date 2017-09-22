package cap1;

import cap1.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Iuri Menin on 22/09/17.
 */
public class Programa {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();
        connection.prepareStatement("SELECT * FROM exemplo");

    }
}

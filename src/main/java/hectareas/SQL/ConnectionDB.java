package hectareas.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    static int x = 0;

    public static Connection getConnection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("https://databases.000webhost.com/index.php?route=/database/structure&db=id21186104_pruebaspikmin", "id21186104_pikmin4", "Pipipopo1415!");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conection;
    }
    public void hola(){
        x = 2321*2;
        System.out.println(x);
    }
}

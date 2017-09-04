package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author JORGMTZAR
 */
public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url="jdbc:mysql://localhost:3306/hrcenterbd";

    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("Conexion Establecida");
            }
                
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al Conectar" + e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null){
            System.out.println("Conexion Terminada");
        }
    }
}
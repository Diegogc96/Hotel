
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "proyectofinal_hotel";
    private static final String usuario = "root";
    private static final String password = "";

    private static Connection conexion;

    public Conexion() {

    }

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL + DB, usuario, password);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver. " + ex.getMessage());
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos"+ex.getMessage());
            }
        }
        return conexion;
    }

}

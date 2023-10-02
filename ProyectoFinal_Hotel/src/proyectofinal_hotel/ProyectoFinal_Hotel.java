
package proyectofinal_hotel;

import AccesoADatos.Conexion;
import java.sql.Connection;


public class ProyectoFinal_Hotel {


    public static void main(String[] args) {
        
        Connection con=null;
        
        con=Conexion.getConexion();
    }
    
}

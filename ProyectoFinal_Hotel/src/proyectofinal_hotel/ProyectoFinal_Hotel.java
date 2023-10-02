
package proyectofinal_hotel;

import AccesoADatos.Conexion;
import AccesoADatos.HuespedData;
import Entidades.Huesped;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class ProyectoFinal_Hotel {


    public static void main(String[] args) {
        
        Connection con=null;
        
        con=Conexion.getConexion();
        HuespedData data=new HuespedData();
        Huesped huesped1=new Huesped("A","AAAA",2,"AAAAAAA", "AAAA@AAA", 11111111,true);
        Huesped huesped2=new Huesped("B","BBBB",1,"BBBBBBB", "BBBB@BBB", 22222222,true);
        List<Huesped> listah=new ArrayList<>();
        
        listah=data.listarHuesped();
        
//        data.guardarHuesped(huesped1);
//        data.guardarHuesped(huesped2);
        
       
        for (Huesped huesped : listah) {
            System.out.println("Nombre: "+ huesped.getNombre());
        }
        
        
        System.out.println("Busqueda por dni: "+data.buscarHuespedPorDni(2));
    }
    
        
    
}

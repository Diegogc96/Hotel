package proyectofinal_hotel;

import AccesoADatos.HabitacionData;
import Categorias.TipoHabitacion;
import Entidades.Habitacion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProyectoFinal_Hotel {

    public static void main(String[] args) {

        Connection con = null;
        
        HabitacionData habitacionData=new HabitacionData();
        List<Habitacion>listaHabitacion=new ArrayList<>();
        TipoHabitacion tip=TipoHabitacion.EstandarSimple;
        listaHabitacion=habitacionData.listarHabitacionesxCategoria(tip);
        for (Habitacion habitacion : listaHabitacion) {
            System.out.println("Id: "+habitacion.getCategoria().getIdCategoria());
        }

}
}

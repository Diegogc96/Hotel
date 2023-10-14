package proyectofinal_hotel;

import AccesoADatos.Conexion;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import Entidades.Reserva;
import java.sql.Connection;

public class ProyectoFinal_Hotel {

    public static void main(String[] args) {

        Connection con = null;
        HuespedData data = new HuespedData();
//        HabitacionData habData = new HabitacionData();
//        Huesped huesped1 = new Huesped("A", "AAAA", 2, "AAAAAAA", "AAAA@AAA", 11111111, true);
        ReservaData reservaData = new ReservaData();
//        Categoria categoria=new Categoria(100, 100, "PruebaCat", "PruebaCat", 100.0);
//        Habitacion habitacion= new Habitacion(categoria, 100, 100, true);
        
//        Reserva reserva = new Reserva(LocalDate.MIN, LocalDate.MIN, 0, 0, huesped1, habitacion, true);
        con = Conexion.getConexion();

//        reservaData.guardarReserva(reserva);

//        Huesped huesped2 = new Huesped("B", "BBBB", 1, "BBBBBBB", "BBBB@BBB", 22222222, true);
//        Huesped huesped3 = new Huesped("Z", "ZZZZ", 1234, "ZZZZZZ", "ZZZZ@ZZZ", 4444444, true);
//        List<Huesped> listah = new ArrayList<>();
//        List<Habitacion> tipohabitacion = new ArrayList<>();
//
//        tipohabitacion = habData.listarHabitacionesxCategoria(7);
//
//        listah = data.listarHuesped();
//
////        data.guardarHuesped(huesped1);
////        data.guardarHuesped(huesped2);
////          data.guardarHuesped(huesped3);
//          System.out.println("Nombre: "+data.buscarHuesped(7).getNombre());
//          
//        for (Huesped huesped : listah) {
//            System.out.println("Nombre: "+ huesped.getNombre());
//        }
//        data.modificarHuesped(huesped3);
//          data.eliminarHuesped(7);
//        
//        
//        System.out.println("Busqueda por dni: "+data.buscarHuespedPorDni(2));
//    }
//    
//        for (Categoria tipohab : tipohabitacion) {
//            System.out.println("Nombre: " + tipohab.getTipoHabitacion());
//        }
                for(Reserva reserva : reservaData.listaReserva()){
                    System.out.println("idHuesped: "+reserva.getIdHuesped());
                    System.out.println("idHabitacion: "+reserva.getIdHabitacion());
                    System.out.println("idReserva: "+reserva.getIdReserva());
                }
    }
    
   
    
    
}

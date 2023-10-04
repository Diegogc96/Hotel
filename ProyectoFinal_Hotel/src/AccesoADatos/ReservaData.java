package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private final Connection con = Conexion.getConexion();

    public ReservaData() {
    }

    public void guardarReserva(Reserva reserva) {

        String sql = "INSERT INTO reserva(fechaInicio,fechaFin,precioTotal,dias,estado,idHuesped,idHabitacion) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(2, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(3, reserva.getPrecioTotal());
            ps.setInt(4, reserva.getDias());
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, reserva.getHuesped().getIdHuesped());
            ps.setInt(7, reserva.getHabitacion().getIdHabitacion());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Reserva añadida con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva");
        }

    }

    public List<Reserva> listaReserva() {

        List<Reserva> listaReserva = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Reserva reserva = null;
            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                listaReserva.add(reserva);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones" + ex.getMessage());
        }

        return listaReserva;
    }

    public List<Reserva> obtenerInscripcionesPorHuesped(int idHuesped) {

        HuespedData huespedData = new HuespedData();
        HabitacionData habitacionData = new HabitacionData();

        List<Reserva> listaReserva = new ArrayList<Reserva>();
        Reserva reserva = null;
        int cont = 1;
        try {
            String sql = "SELECT * FROM reserva r WHERE idReserva = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                reserva.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                reserva.setPrecioTotal(rs.getDouble("precioTotal"));
                reserva.setDias(rs.getInt("dias"));
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setHuesped(huespedData.buscarHuesped(idHuesped));
                reserva.setHabitacion(habitacionData.buscarHabitacion(rs.getInt("idMateria")));
                listaReserva.add(reserva);
                cont++;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return listaReserva;
    }

    public List<Habitacion> obtenerHabitacionesReservadas(int idHuesped) {

        List<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
        try {
            String sql = "SELECT r.idHabitacion, piso, nroHabitacion FROM reserva r JOIN "
                    + "habitacion h ON(h.idHabitacion = r.idHabitacion) WHERE r.idHuesped = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            Habitacion habitacion;
            while (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                listaHabitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas" + ex.getMessage());
        }
        return listaHabitaciones;
    }

    public List<Habitacion> obtenerHabitacionesNoReservadas(int idHuesped) {
        List<Habitacion> listaHabitacion = new ArrayList<Habitacion>();

        try {
            String sql = "SELECT h.idHabitacion, h.piso, h.nroHabitacion FROM habitacion h LEFT JOIN reserva r ON (r.idHabitacion= r.idHabitacion AND r.idHuesped = ?)"
                    + "WHERE r.idHabitacion IS NULL;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);

            ResultSet rs = ps.executeQuery();
            Habitacion habitacion;

            while (rs.next()) {

                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                listaHabitacion.add(habitacion);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reservas" + ex.getMessage());
        }
        return listaHabitacion;

    }

}

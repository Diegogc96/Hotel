package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion(piso, nroHabitacion, estado) VALUES ( ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getPiso());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setBoolean(3, habitacion.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación añadida con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion" + ex.getMessage());
        }
    }

    public List<Categoria> listarHabitacionesCategoria() {

        List<Categoria> listaHabitacionCategoria = new ArrayList<>();

        try {
            String sql = "SELECT c.tipoHabitacion ,piso, nroHabitacion, h.estado FROM habitacion h JOIN categoria c ON (h.idCategoria=c.idCategoria);";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria tipohabitacion = new Categoria();

                tipohabitacion.setPiso(rs.getInt("piso"));
                tipohabitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                tipohabitacion.setEstado(rs.getBoolean("estado"));
                tipohabitacion.setTipoHabitacion(rs.getString("tipoHabitacion"));
                listaHabitacionCategoria.add(tipohabitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return listaHabitacionCategoria;
    }

    public List<Habitacion> listarHabitaciones() {

        List<Habitacion> listaHabitacion = new ArrayList<>();

        try {
            String sql = "SELECT * FROM habitacion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria tipohabitacion = new Categoria();

                tipohabitacion.setPiso(rs.getInt("piso"));
                tipohabitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                tipohabitacion.setEstado(rs.getBoolean("estado"));
                listaHabitacion.add(tipohabitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return listaHabitacion;
    }

    public void modificarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET piso = ?, nroHabitacion = ? , estado = ?  WHERE idHabitacion = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getPiso());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setInt(4, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion" + ex.getMessage());
        }
    }

    public void eliminarHabitacion(int idHabitacion) {

        try {
            String sql = "UPDATE habitacion SET estado = 0 WHERE idHabitacion = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la habitacion.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion");
        }
    }
    
    public Habitacion buscarHabitacion(int idHabitacion) {

        String sql = "SELECT piso, nroHabitacion, estado FROM habitacion WHERE idHabitacion=?";
        Habitacion habitacion = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                habitacion = new Habitacion();
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdHabitacion(idHabitacion);

            } else {
                JOptionPane.showMessageDialog(null, "Esa Habitacion no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla habitacion");
        }

        return habitacion;
    }
   

}

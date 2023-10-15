package AccesoADatos;

import Entidades.Habitacion;
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

        String sql = "INSERT INTO habitacion(piso, nroHabitacion, estado, idCategoria) VALUES ( ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, habitacion.getPiso());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setInt(4, habitacion.getCategoria().getIdCategoria());
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

    public List<Habitacion> listarHabitacionesxCategoria(int idCategoria) {

        List<Habitacion> listaHabitacionCategoria = new ArrayList<>();
        CategoriaData catData = new CategoriaData();

        try {
            String sql = "SELECT c.tipoHabitacion ,piso, nroHabitacion, h.estado FROM habitacion h JOIN categoria c ON (h.idCategoria=c.idCategoria) WHERE idCategoria = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion tipohabitacion = new Habitacion();

                tipohabitacion.setPiso(rs.getInt("piso"));
                tipohabitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                tipohabitacion.setEstado(rs.getBoolean("estado"));
                tipohabitacion.setCategoria(catData.buscarCategoria(idCategoria));
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
        CategoriaData catData = new CategoriaData();
        try {
            String sql = "SELECT * FROM habitacion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setCategoria(catData.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                listaHabitacion.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return listaHabitacion;
    }

    public List<Habitacion> listarHabitacionesActivas() {

        List<Habitacion> listaHabitacion = new ArrayList<>();
        CategoriaData catData = new CategoriaData();
        try {
            String sql = "SELECT * FROM habitacion WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setCategoria(catData.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                listaHabitacion.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return listaHabitacion;
    }

    public List<Habitacion> listarHabitacionesNoActivas() {

        List<Habitacion> listaHabitacion = new ArrayList<>();
        CategoriaData catData = new CategoriaData();
        try {
            String sql = "SELECT * FROM habitacion WHERE estado = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setCategoria(catData.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                listaHabitacion.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion " + ex.getMessage());
        }
        return listaHabitacion;
    }

    public void actualizarHabitacion(Habitacion habitacion) {

        String sql = "UPDATE habitacion SET piso = ?, estado = ? , idCategoria = ? WHERE nroHabitacion = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getPiso());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setInt(3, habitacion.getCategoria().getIdCategoria());
            ps.setInt(4, habitacion.getNroHabitacion());

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

    public void modificarHabitacionLibre(int nroHabitacion) {

        try {
            String sql = "UPDATE habitacion SET estado = 1 WHERE nroHabitacion = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroHabitacion);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion");
        }
    }

    public void modificarHabitacionOcupada(int nroHabitacion) {

        try {
            String sql = "UPDATE habitacion SET estado = 0 WHERE nroHabitacion = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroHabitacion);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla habitacion");
        }
    }

    public Habitacion buscarHabitacion(int nroHabitacion) {

        CategoriaData categoriaData = new CategoriaData();
        String sql = "SELECT * FROM habitacion WHERE nroHabitacion=?";
        Habitacion habitacion = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCategoria(categoriaData.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "Esa Habitacion no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla habitacion");
        }

        return habitacion;
    }

    public Habitacion buscarHabitacionId(int idHabitacion) {

        CategoriaData categoriaData = new CategoriaData();
        String sql = "SELECT * FROM habitacion WHERE idHabitacion=?";
        Habitacion habitacion = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCategoria(categoriaData.buscarCategoria(rs.getInt("idCategoria")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));

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

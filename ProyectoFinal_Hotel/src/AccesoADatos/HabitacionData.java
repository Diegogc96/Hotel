/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
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
            ps.setInt(2, habitacion.getNmroHabitacion());
            ps.setBoolean(3, habitacion.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación añadida con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Huesped" + ex.getMessage());
        }
    }

    public List<Habitacion> listarHabitaciones() {

        List<Habitacion> listaHabitacion = new ArrayList<>();

        try {
            String sql = "SELECT * FROM habitacion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setNmroHabitacion(rs.getInt("nroHabitacion"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
               // habitacion.setCategoria(rs.getObject("idCategoria"));
                listaHabitacion.add(habitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Huesped " + ex.getMessage());
        }
        return listaHabitacion;
    }

}

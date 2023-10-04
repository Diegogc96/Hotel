package AccesoADatos;

import Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaData {

    private Connection con = null;

    public CategoriaData() {
        con = Conexion.getConexion();
    }

    public void guardarCategoria(Categoria categoria) {

        String sql = "INSERT INTO categoria(tipoHabitacion, tipoCama, cantCamas, precio, cantPersonas, estado) VALUES ( ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, categoria.getTipoHabitacion());
            ps.setString(2, categoria.getTipoCama());
            ps.setInt(3, categoria.getCantCamas());
            ps.setDouble(4, categoria.getPrecioNoche());
            ps.setInt(5, categoria.getCantPersonas());
            ps.setBoolean(6, categoria.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                categoria.setIdCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Categoria añadida con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoria" + ex.getMessage());
        }
    }

    public void modificarCategoria(Categoria categoria) {

        String sql = "UPDATE categoria SET tipoHabitacion = ?, tipoCama = ?, cantCamas = ?, precio = ?, cantPersonas = ?, estado = ?  WHERE idCategoria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, categoria.getTipoHabitacion());
            ps.setString(2, categoria.getTipoCama());
            ps.setInt(3, categoria.getCantCamas());
            ps.setDouble(4, categoria.getPrecioNoche());
            ps.setInt(5, categoria.getCantPersonas());
            ps.setBoolean(6, categoria.isEstado());
            ps.setInt(7, categoria.getIdCodigo());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La categoria no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoria " + ex.getMessage());
        }
    }

    public void eliminarCategoria(int idCategoria) {

        try {
            String sql = "UPDATE categoria SET estado = 0 WHERE idCategoria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la categoria.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla categoria");
        }
    }

    public List<Categoria> listarCategoria() {

        List<Categoria> listaHabitacion = new ArrayList<>();

        try {
            String sql = "SELECT * FROM categoria;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria tipohabitacion = new Categoria();

                tipohabitacion.setPiso(rs.getInt("piso"));
                tipohabitacion.setNroHabitacion(rs.getInt("nroHabitacion"));
                tipohabitacion.setEstado(rs.getBoolean("estado"));
                tipohabitacion.setTipoHabitacion(rs.getString("tipoHabitacion"));
                listaHabitacion.add(tipohabitacion);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla categoria " + ex.getMessage());
        }
        return listaHabitacion;
    }

    public Categoria buscarCategoria(int idCategoria) {

        String sql = "SELECT tipoHabitacion, tipoCama, cantCamas, precio, cantPersonas, estado  FROM categoria WHERE idCategoria=?";
        Categoria categoria = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                categoria = new Categoria();
                categoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                categoria.setTipoCama(rs.getString("tipoCama"));
                categoria.setCantCamas(rs.getInt("cantCamas"));
                categoria.setPrecioNoche(rs.getDouble("precio"));
                categoria.setCantPersonas(rs.getInt("cantPersonas"));
                categoria.setEstado(rs.getBoolean("estado"));
                categoria.setIdCodigo(idCategoria);

            } else {
                JOptionPane.showMessageDialog(null, "Esa Categoria no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla categoria");
        }

        return categoria;
    }

}

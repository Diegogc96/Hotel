package AccesoADatos;

import Categorias.TipoHabitacion;
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

        String sql = "INSERT INTO categoria(tipoHabitacion, tipoCama, cantCamas, precio, cantPersonas) VALUES ( ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, categoria.getTipoHabitacion());
            ps.setString(2, categoria.getTipoCama());
            ps.setInt(3, categoria.getCantCamas());
            ps.setDouble(4, categoria.getPrecioNoche());
            ps.setInt(5, categoria.getCantPersonas());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                categoria.setIdCategoria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Categoria añadida con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoria" + ex.getMessage());
        }
    }

    public void actualizarCategoria(Categoria categoria) {

        String sql = "UPDATE categoria SET tipoHabitacion = ?, tipoCama = ?, cantCamas = ?, precio = ?, cantPersonas = ? WHERE idCategoria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, categoria.getTipoHabitacion());
            ps.setString(2, categoria.getTipoCama());
            ps.setInt(3, categoria.getCantCamas());
            ps.setDouble(4, categoria.getPrecioNoche());
            ps.setInt(5, categoria.getCantPersonas());
            ps.setInt(6, categoria.getIdCategoria());
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
            String sql = "DELETE FROM categoria WHERE idCategoria = ? ";
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

        List<Categoria> listaCategoria = new ArrayList<>();

        try {
            String sql = "SELECT * FROM categoria;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria tipoCategoria = new Categoria();

                tipoCategoria.setCantPersonas(rs.getInt("cantPersonas"));
                tipoCategoria.setCantCamas(rs.getInt("cantCamas"));
                tipoCategoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                tipoCategoria.setTipoCama(rs.getString("tipoCama"));
                tipoCategoria.setPrecioNoche(rs.getDouble("precio"));
                tipoCategoria.setIdCategoria(rs.getInt("idCategoria"));
                listaCategoria.add(tipoCategoria);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla categoria " + ex.getMessage());
        }
        return listaCategoria;
    }

    public Categoria buscarCategoria(int idCategoria) {

        String sql = "SELECT tipoHabitacion, tipoCama, cantCamas, precio, cantPersonas FROM categoria WHERE idCategoria=?";
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
                categoria.setIdCategoria(idCategoria);

            } else {
                JOptionPane.showMessageDialog(null, "Esa Categoria no existe");
            }
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla categoria");
        }

        return categoria;
    }

    public List<Categoria> listarCategoriasxTipoHabitacion(TipoHabitacion tipoHabitacion) {
        List<Categoria> listaCategoria = new ArrayList<>();

        try {
            String sql = "SELECT * FROM categoria WHERE tipoHabitacion = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoHabitacion.toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Categoria tipoCategoria = new Categoria();

                tipoCategoria.setCantPersonas(rs.getInt("cantPersonas"));
                tipoCategoria.setCantCamas(rs.getInt("cantCamas"));
                tipoCategoria.setTipoHabitacion(rs.getString("tipoHabitacion"));
                tipoCategoria.setTipoCama(rs.getString("tipoCama"));
                tipoCategoria.setPrecioNoche(rs.getDouble("precio"));
                tipoCategoria.setIdCategoria(rs.getInt("idCategoria"));
                listaCategoria.add(tipoCategoria);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla categoria " + ex.getMessage());
        }
        return listaCategoria;

    }
}

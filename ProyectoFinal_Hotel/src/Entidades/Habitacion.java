
package Entidades;


public class Habitacion {
    
    protected int idHabitacion;
    protected tipoHabitacion categoria;
    protected int piso;
    protected boolean estado;

    public Habitacion() {
    }

    public Habitacion(tipoHabitacion categoria, int piso, boolean estado) {
        this.categoria = categoria;
        this.piso = piso;
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, tipoHabitacion categoria, int piso, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.categoria = categoria;
        this.piso = piso;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public tipoHabitacion getCategoria() {
        return categoria;
    }

    public void setCategoria(tipoHabitacion categoria) {
        this.categoria = categoria;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idHabitacion=" + idHabitacion + ", categoria=" + categoria + ", piso=" + piso + ", estado=" + estado;
    }
    
    
    
}

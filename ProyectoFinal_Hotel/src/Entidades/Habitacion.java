
package Entidades;


public class Habitacion {
    
    protected int idHabitacion;
    protected int piso;
    protected int nroHabitacion;
    protected boolean estado;

    public Habitacion() {
    }

    public Habitacion(int piso, int nroHabitacion, boolean estado) {
        this.piso = piso;
        this.nroHabitacion = nroHabitacion;
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, int piso, int nroHabitacion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.nroHabitacion = nroHabitacion;
        this.estado = estado;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idHabitacion=" + idHabitacion + ", piso=" + piso + ", nroHabitacion=" + nroHabitacion + ", estado=" + estado;
    }

    

    void cambiarPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
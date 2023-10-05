
package Entidades;
//ingresar comparable en habitacion categoria 

public class Habitacion implements Comparable<Habitacion>{
    
    protected int idHabitacion;
    protected Categoria categoria;
    protected int piso;
    protected int nroHabitacion;
    protected boolean estado;

    public Habitacion() {
    }

    public Habitacion(Categoria categoria, int piso, int nroHabitacion, boolean estado) {
        this.categoria = categoria;
        this.piso = piso;
        this.nroHabitacion = nroHabitacion;
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, Categoria categoria, int piso, int nroHabitacion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        return "idHabitacion=" + idHabitacion + ", Categoria=" + categoria + ", piso=" + piso + ", nroHabitacion=" + nroHabitacion + ", estado=" + estado;
    }

   @Override
    public int compareTo(Habitacion o) {
        if (idHabitacion == o.idHabitacion) {
            return 0;
        } else if (idHabitacion > o.idHabitacion) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
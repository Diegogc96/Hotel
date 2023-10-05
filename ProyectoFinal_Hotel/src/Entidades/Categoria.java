package Entidades;

public final class Categoria implements Comparable<Categoria> {

    private int idCategoria;
    private int cantPersonas;
    private int cantCamas;
    private String tipoHabitacion;
    private String tipoCama;
    private double precioNoche;

    public Categoria() {
    }

    public Categoria(int cantPersonas, int cantCamas, String tipoHabitacion, String tipoCama, double precioNoche) {
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public Categoria(int idCategoria, int cantPersonas, int cantCamas, String tipoHabitacion, String tipoCama, double precioNoche) {
        this.idCategoria = idCategoria;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return tipoHabitacion;
    }
    
    
    @Override
    public int compareTo(Categoria o) {
        if (idCategoria == o.idCategoria) {
            return 0;
        } else if (idCategoria > o.idCategoria) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
    public void cambiarPrecio() {
        
    }
    
    
    
}

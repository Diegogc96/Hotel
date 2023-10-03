package Entidades;

public final class Categoria extends Habitacion {

    private int idCodigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoHabitacion;
    private String tipoCama;
    private double precioNoche;

    public Categoria() {
    }

    public Categoria(int cantPersonas, int cantCamas, String tipoHabitacion, String tipoCama, double precioNoche, int piso, int nroHabitacion, boolean estado) {
        super(piso, nroHabitacion, estado);
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public Categoria(int idCodigo, int cantPersonas, int cantCamas, String tipoHabitacion, String tipoCama, double precioNoche, int idHabitacion, int piso, int nroHabitacion, boolean estado) {
        super(idHabitacion, piso, nroHabitacion, estado);
        this.idCodigo = idCodigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
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
        return "idCodigo=" + idCodigo + ", cantPersonas=" + cantPersonas + ", cantCamas=" + cantCamas + ", tipoHabitacion=" + tipoHabitacion + ", tipoCama=" + tipoCama + ", precioNoche=" + precioNoche;
    }

    

    @Override
    public void cambiarPrecio() {
        super.cambiarPrecio();

    }
}

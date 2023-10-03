package Entidades;

public final class tipoHabitacion extends Habitacion {

    private int idCodigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCama;
    private double precioNoche;

    public tipoHabitacion() {
    }

    public tipoHabitacion(int cantPersonas, int cantCamas, String tipoCama, double precioNoche, tipoHabitacion categoria, int piso, int nmroHabitacion, boolean estado) {
        super(categoria, piso, nmroHabitacion, estado);
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public tipoHabitacion(int idCodigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche, int idHabitacion, tipoHabitacion categoria, int piso, int nmroHabitacion, boolean estado) {
        super(idHabitacion, categoria, piso, nmroHabitacion, estado);
        this.idCodigo = idCodigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
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
    public void cambiarPrecio() {
        super.cambiarPrecio();

    }
}

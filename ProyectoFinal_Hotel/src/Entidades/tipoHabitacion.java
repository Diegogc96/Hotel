package Entidades;


public final class tipoHabitacion extends Habitacion{
    
   private final int idCodigo;
   private final int cantPersonas;
   private final int cantCamas;
   private final String tipoCama;
   private final double precioNoche;

    public tipoHabitacion(int idCodigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche, tipoHabitacion categoria, int piso, boolean estado) {
        super(categoria, piso, estado);
        this.idCodigo = idCodigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public tipoHabitacion(int idCodigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche, int idHabitacion, tipoHabitacion categoria, int piso, boolean estado) {
        super(idHabitacion, categoria, piso, estado);
        this.idCodigo = idCodigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    
    
}

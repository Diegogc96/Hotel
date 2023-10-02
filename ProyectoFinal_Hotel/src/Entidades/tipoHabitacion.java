package Entidades;


public class tipoHabitacion extends Habitacion{
    
   private int codigo;
   private int cantPersonas;
   private int cantCamas;
   private String tipoCama;
   private double precioNoche;

    public tipoHabitacion(int codigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche) {
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    public tipoHabitacion(int codigo, int cantPersonas, int cantCamas, String tipoCama, double precioNoche, int idHabitacion, tipoHabitacion categoria, int piso, boolean estado) {
        super(idHabitacion, categoria, piso, estado);
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCama = tipoCama;
        this.precioNoche = precioNoche;
    }

    
    
}

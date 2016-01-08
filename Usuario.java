
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // nombre del usuario
    private String nombre;
    // grasas del usuario
    private float grasasDelUsuario;
    // carbohidratos del usuario
    private float carbohidratosDelUsuario;
    // proteinas del usuario
    private float proteinasDelUsuario;
    // calorias del usuario
    private float caloriasTotales;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
       this.nombre = nombre;    
       this.grasasDelUsuario = 0;
       this.carbohidratosDelUsuario = 0;
       this.proteinasDelUsuario =0;
       this.caloriasTotales = 0;
       
    }

    /**
     * metodo que utilizamos para dar de comer al usuario
     */
    public void comer ( Alimentos alimento, float gramos)
    {
       carbohidratosDelUsuario = carbohidratosDelUsuario + (((alimento.getCarbohidratos())/100)* gramos);
       grasasDelUsuario = grasasDelUsuario + (((alimento.getGrasas())/100)* gramos);
       proteinasDelUsuario = proteinasDelUsuario + (((alimento.getProteinas())/100)* gramos);
       caloriasTotales = (carbohidratosDelUsuario*4) + ( grasasDelUsuario*9) + (proteinasDelUsuario*4);
    }
    
    /**
     * metodo para mostrar los datos del usuario
     */
    
    public void muestraDatos()
    {
        System.out.println("Nombre:                           " + nombre);
        System.out.println("Proteinas por cada 100 gramos:    " + proteinasDelUsuario);
        System.out.println("Carbohidratos por cada 100 gramos:" + carbohidratosDelUsuario);
        System.out.println("Grasas por cada 100 gramos:       " +  grasasDelUsuario);
        System.out.println("Calorias:                         " + caloriasTotales);
    }
}

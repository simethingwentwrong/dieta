
/**
 * Write a description of class Alimentos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimentos
{
    // proteinas del alimento
    private float proteinas;
    // carbohidratos del alimetno
    private float carbohidratos;
    // grasas del alimetno
    private float grasas;
    // calorias del alimetno
    private float calorias;
    //  nombre del alimento
    private String nombre;
    /**
     * Constructor for objects of class Alimentos
     */
    public Alimentos(String nombre, float proteinas, float carbohidratos, float grasas)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas*4) + (carbohidratos*4) + (grasas*9);
    }

    /**
     * Este metodo nos muestra los datos del alimento
     */
    public void muestraDatos()
    {
        System.out.println("Nombre:                           " + nombre);
        System.out.println("Proteinas por cada 100 gramos:    " + proteinas);
        System.out.println("Carbohidratos por cada 100 gramos:" + carbohidratos);
        System.out.println("Grasas por cada 100 gramos:       " + grasas);
        System.out.println("Calorias:                         " + calorias);
        if (proteinas > carbohidratos && proteinas > grasas)
        {
            System.out.println("Componente/s mayoritario/s:                          proteinas");
        }
         else if (carbohidratos > proteinas && carbohidratos > grasas)
        {
            System.out.println("Componente/s mayoritario/s:                          carbohidratos");
        }
        else if (grasas > carbohidratos && grasas > proteinas)
        {
            System.out.println("Componente/s mayoritario/s:                          grasas");
        }
        else if (proteinas == grasas && proteinas == carbohidratos)
         {
             System.out.println("Componente/s mayoritario/s:                          proteinas , grasas , carbohidratos");
         }
         else if (grasas == carbohidratos )
        {
            System.out.println("Componente/s mayoritario/s:                          grasas , carbohidratos");
        }
         else if (carbohidratos == proteinas)
        {
            System.out.println("Componente/s mayoritario/s:                          carbohidratos , proteinas");           
        }
        else  
        {
            System.out.println("Componente/s mayoritario/s:                          proteinas , grasas");
        }
        
    }
    
    /**
     * valor de las proteinas
     */
    public float getProteinas()
    {
        return proteinas;
    }
    
    /**
     * valor de los carbohidratos
     */
    public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
    /**
     * valor de las grasas
     */
    public float getGrasas()
    {
        return grasas;
    }
}

    



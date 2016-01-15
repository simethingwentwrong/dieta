import java.util.ArrayList;
public class Usuario
{
        //nombre del usuario
	private String nombreCompleto;
	//proteinas  ingeridas por el usuario
	private float proteinasIngeridas;
	//carbohidratos   ingeridas por el usuario
	private float carbohidratosIngeridos;
	//grasas ingeridas por el usuario
	private float grasasIngeridas;
	//calorias totales ingeridas por el usuario
	private float caloriasIngeridas;
	//alimento mas calorico
	private float alimentoMasCalorico;
	private String nombreDelAlimentoMasCalorico;
	//creamos la lista
	private ArrayList<Alimento> alimentos;
	

	/**
	*Constructor de la clase usuario
	*/
	public Usuario (String nombreCompleto)
	{
		this.nombreCompleto = nombreCompleto;	
		proteinasIngeridas = 0;
		carbohidratosIngeridos = 0;
		grasasIngeridas = 0;
		caloriasIngeridas = 0;
		nombreDelAlimentoMasCalorico = null;
		alimentoMasCalorico = 0;
		alimentos = new ArrayList<Alimento>();
	}
	
	/**
	* Metodo utilizado para dar de comer al usuario
	*/
	public void comer(Alimento alimentoQueCome, float gramosDelAlimento)
	{
		proteinasIngeridas = proteinasIngeridas + (alimentoQueCome.getProteinas() / 100 * gramosDelAlimento);
		carbohidratosIngeridos = carbohidratosIngeridos + (alimentoQueCome.getCarbohidratos() / 100 * gramosDelAlimento);
		grasasIngeridas = grasasIngeridas + (alimentoQueCome.getGrasas() / 100 * gramosDelAlimento);
		caloriasIngeridas = caloriasIngeridas + (alimentoQueCome.getCalorias() / 100 * gramosDelAlimento);
		alimentos.add(alimentoQueCome);
		if (alimentoMasCalorico <= alimentoQueCome.getCalorias())
		{
		    alimentoMasCalorico = alimentoQueCome.getCalorias();
		    nombreDelAlimentoMasCalorico = alimentoQueCome.getNombreAlimento();
		}
	}
	
	
	
	/**
	* Metodo que muestra la informacion de lo ingerido por el usuario.
	*/
	public void muestraDatos()
	{
		float totalNutrientes = (proteinasIngeridas + grasasIngeridas + carbohidratosIngeridos) / 100;
       		String datosProteinas = "Gramos totales de proteinas ingeridos:     " + proteinasIngeridas;
        	String datosCarbohidratos = "Gramos totales de carbohidratos ingeridos: " + 			carbohidratosIngeridos;
        	String datosGrasas = "Gramos totales de grasas ingeridos:        " + grasasIngeridas;
        	if (proteinasIngeridas > 0) {
            	datosProteinas = datosProteinas + " (" + proteinasIngeridas / totalNutrientes + "%)";
        	}
        	if (carbohidratosIngeridos > 0) {
            	datosCarbohidratos = datosCarbohidratos + " (" + carbohidratosIngeridos / totalNutrientes + "%		)";
        	}
        	if (grasasIngeridas > 0) {
            	datosGrasas = datosGrasas + " (" + grasasIngeridas / totalNutrientes + "%)";
        	}
        	System.out.println("Nombre:                                    " + nombreCompleto);
        	System.out.println(datosProteinas);    
        	System.out.println(datosCarbohidratos);
        	System.out.println(datosGrasas);
        	System.out.println("Calorias totales ingeridas:                " + caloriasIngeridas);	
		}
    
    /**
     * hacemos que nos devuelba el valor de las calorias ingeridas
     */
    public float getCaloriasIngeridas()
		{
		    return caloriasIngeridas;
		  }
		  
	 /**
      * hacemos que devuelba el nombre del usuario
	  */
    public String getNombreCompleto()
    {
	    return nombreCompleto;
		}
		
		/**
		 * Hacemos la comparacion entre los dos usuarios para ver las calorias ingeridas
		 */
		public void comparar (Usuario usuario2)
		{
		if (caloriasIngeridas > usuario2.getCaloriasIngeridas())
		{
		    System.out.println("El Usuario " + nombreCompleto + "ha cnsumido mas calorias que " +  usuario2.getNombreCompleto() + " (" + caloriasIngeridas + " frente a " + usuario2.getCaloriasIngeridas() + ")");
		}
		if (caloriasIngeridas < usuario2.getCaloriasIngeridas())
		{
		    System.out.println("El Usuario " + usuario2.getNombreCompleto() + "ha cnsumido mas calorias que " + nombreCompleto + " (" + usuario2.getCaloriasIngeridas() + " frente a " + caloriasIngeridas + ")");
		}
		else 
		{
		    System.out.println("El Usuario " + nombreCompleto + "ha consumido las mismas calorias que " +  usuario2.getNombreCompleto() + " (" + caloriasIngeridas + " frente a " + usuario2.getCaloriasIngeridas() + ")");		  
		}
    }
    
   
   
    /**
     * nos da el nombre del alimento mas calorico consumido hasta ahora o si no se a consumido alimentos salta mensaje
     */
    public void muestrameElAlimentoMasCalorico()
    {
        if (nombreDelAlimentoMasCalorico == null)
        {
             System.out.println("No se ha consumido ningun alimento");
        }
        else
        {
           System.out.println("Alimento mas calorico ingerido por este usuario hasta el momento: " + nombreDelAlimentoMasCalorico  + " (" + alimentoMasCalorico + " calorias por cada 100 gramos)");
        }
    }
    
   
    
     /**
     * .
     */
    public void verAlimentoEnPosicion(int posicion)
    {
        
        posicion = posicion -1;
        if(posicion >= 0 && posicion < alimentos.size()) {
            System.out.println ("El alimento en la posicion " + (posicion+1) + " es :");
            alimentos.get(posicion).muestraDatos();
            
        }
        else
        {
            System.out.println ("La posicion es incorrecta");
        }
    }
    
    /**
     * indique si el usuario ha comido ese alimento más de una vez o no y, en caso afirmativo, cuántas veces lo ha hecho.
     */
    public void cuantasVecesLoHeComido (String alimentoComprobar)
    {
        int cont = 0;
        for( Alimento comido : alimentos)
        {
            
            if (comido.getNombreAlimento().contains(alimentoComprobar))
            {
                cont = cont+1 ;
            }
        }
        if (cont == 0 || cont == 1)
        {
            System.out.println ("no ha comido ningun alimento mas de una vez con ese nombre");
        }
        else if (cont >=2)
        {
            System.out.println ("El usuario ha comido " + cont + " veces el alimento solicitado");
        }
    }
    
     /**
     * indique si el usuario ha comido ese alimento más de una vez o no y, en caso afirmativo, cuántas veces lo ha hecho.
     */
    public void cuantasVecesLoHeComido2 ()
    {
        int cont = 0;
        for( Alimento comido : alimentos)
        {  
             
            for ( Alimento comidoAhora : alimentos)
            {
                Alimento comidoActualmente = comido;
            if (comidoActualmente.getNombreAlimento().contains(comido.getNombreAlimento()))
            {
                cont = cont+1 ;
            }
            }
        }
        if (cont == 0 || cont == 1)
        {
            System.out.println ("no ha comido ningun alimento mas de una vez con ese nombre");
        }
        else if (cont >=2)
        {
            System.out.println ("El usuario ha comido " + getNombreAlimento() + " veces el alimento solicitado");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

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
}
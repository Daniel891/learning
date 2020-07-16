
public class manipula_cadenas_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase= "Hoy es un estupendo día";
		
		String frase_resumen=frase.substring(0, 7) + "Jueves, " + 
		frase.substring(7, 23);
		
		System.out.println(frase_resumen);

	}

}

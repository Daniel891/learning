import java.util.Scanner;

//VIDEO 48 TIPOS ENUMERADOS

public class Uso_Tallas {
	
	//enum Talla{PEQUE�A, MEDIANA, GRANDE};
	
	enum Talla{
		
		PEQUE�A("S"), MEDIANA("M"), GRANDE("L");
		
		private Talla(String abreviatura) {    //constructor
			
			this.abreviatura=abreviatura;
			
		}
		
		public String dameAbreviatura(){
			
			return abreviatura;
			
		}
		
		private String abreviatura;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Talla s=Talla.PEQUE�A;
		
		Talla m=Talla.MEDIANA;
		
		Talla L=Talla.GRANDE;*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce una talla: Peque�a, Mediana o Grande");
		
		String entrada_datos= entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla: " + la_talla + " - " + la_talla.dameAbreviatura());
	

	}

}

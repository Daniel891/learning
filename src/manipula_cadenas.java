
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Daniel";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Y tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra es la " + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("La última letra es la " + nombre.charAt(ultima_letra-1));

	}

}

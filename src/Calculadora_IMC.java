import javax.swing.JOptionPane;

public class Calculadora_IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero= JOptionPane.showInputDialog("¿Hombre o Mujer?");
		
		
		do {
			
				
			genero= JOptionPane.showInputDialog("Por favor intruduzca el género correctamente");
				
				
		}while (genero.equalsIgnoreCase("Hombre")==false && genero.equalsIgnoreCase("Mujer")==false);
		
		
		if (genero.equalsIgnoreCase("Hombre")) {
			
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Intruce altura en cm por favor"));
			
			System.out.println("Su peso ideal es " + (altura-110) + ("Kg"));
			
		}
		
		else if (genero.equalsIgnoreCase("Mujer")) {
			

			int altura=Integer.parseInt(JOptionPane.showInputDialog("Intruce altura en cm por favor"));
			
			System.out.println("Su peso ideal es " + (altura-120) + ("Kg"));
			
		}
			

	}

}

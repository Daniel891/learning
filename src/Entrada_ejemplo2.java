import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Dime tu nombre");
		
		String edad=JOptionPane.showInputDialog("Dime tu edad");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + (edad_usuario+1) + " años");

	}

}

import java.util.*;
import javax.swing.*;

public class entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige de que quires calcular el �rea: \n 1: Cuadrado \n 2: Rect�ngulo \n 3: Tri�ngulo \n 4: C�rculo");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduce lado"));
			
			System.out.println("El �rea del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
			
			double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El �rea del rect�ngulo es: " + (base*altura));
			
			break;
			
		case 3:
			
			base=Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
			
			altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El �rea del tri�ngulo es: " + (base*altura)/2);
			
			break;
			
		case 4:
			
			double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce radio"));
			
			System.out.print("El �rea del c�rculo es: ");
			
			System.out.printf("%1.4f", Math.PI*Math.pow(radio, 2));
			
			break;
			
		default:
			
			System.out.println("Opci�n no v�lida");
		
		}

	}

}

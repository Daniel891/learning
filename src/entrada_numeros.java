import java.util.*;
import javax.swing.*;

public class entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige de que quires calcular el área: \n 1: Cuadrado \n 2: Rectángulo \n 3: Triángulo \n 4: Círculo");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			
			double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduce lado"));
			
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
			
			double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El área del rectángulo es: " + (base*altura));
			
			break;
			
		case 3:
			
			base=Double.parseDouble(JOptionPane.showInputDialog("Introduce base"));
			
			altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El área del triángulo es: " + (base*altura)/2);
			
			break;
			
		case 4:
			
			double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce radio"));
			
			System.out.print("El área del círculo es: ");
			
			System.out.printf("%1.4f", Math.PI*Math.pow(radio, 2));
			
			break;
			
		default:
			
			System.out.println("Opción no válida");
		
		}

	}

}

package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Coche micoche=new Coche();   //INSTANCIAR UNA CLASE; EJEMPLAR DE CLASE
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_color());
		
		System.out.println(micoche.dime_datos_generales());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("�Quiere asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("�Quiere climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es : " + micoche.precio_coche());
		
		*/
		
		
		//System.out.println("Este coche tiene " + Ford.ruedas + " ruedas");
		
		
		
		//practicando herencia
		
		Coche micoche1= new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("Negro");
		
		mifurgoneta1.configura_asientos("si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales());
		
		System.out.println(mifurgoneta1.dime_datos_generales() 
				+ mifurgoneta1.dimeDatosFurgoneta());

	}

}
 
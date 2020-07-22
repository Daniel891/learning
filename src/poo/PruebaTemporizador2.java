package poo;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);

	}

}


class Reloj {
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente=new DameLaHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	}
	
	private int intervalo;
	
	private boolean sonido;
	
	
	private class DameLaHora2 implements ActionListener{       //clase interna, que si puede usar private
		
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora=new Date();
			
			System.out.println("La hora ->" + ahora);
			
			if (sonido) {      //Se esta usando la variable sonido que no se ha definido en esta clase 
				
				Toolkit.getDefaultToolkit().beep();
				
			}
			
		}
		
	}
	
}

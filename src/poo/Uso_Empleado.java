package poo;

import java.util.*;


public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Paco Mer", 85000, 1997, 05, 20);
		
		Empleado empleado2=new Empleado("Mary Mer", 95000, 1999, 05, 2);
		
		empleado1.subirSueldo(7);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + 
		empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		*/
		
		Jefatura jefe_RRHH=new Jefatura("Juan Pil", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[4];
		
		misEmpleados[0]=new Empleado("Paco Mer", 85000, 1990, 2, 5);
		
		misEmpleados[1]=new Empleado("Mari Gil", 95000, 1993, 4, 30);
		
		misEmpleados[2]=jefe_RRHH;   //Polimorfismo en acción. Principio de sustitución
		
		misEmpleados[3]=new Jefatura("Clara Lago", 95000, 1965, 3, 15);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[3];       //Casting de objetos: se pasa de tipo empleado a jefatura
		
		
		jefa_finanzas.estableceIncentivo(10000);   //ahora puede usar ese metodo gracias al casting
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas vacaciones"));
		
		System.out.println("El jefe " + jefa_finanzas.dameNombre() + " tiene un bonus de " + jefa_finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[2].dameNombre() + " Tiene un bonus de " + misEmpleados[2].establece_bonus(200));
		
		for (int i=0; i<3; i++) {
			
			misEmpleados[i].subirSueldo(7);
			
		}
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ " Sueldo: " + misEmpleados[i].dameSueldo() +  " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
			
		} 
		
		for (Empleado e: misEmpleados) {     //bucle for mejorado
			
			System.out.println("Nombre: " + e.dameNombre()
					+ " Sueldo: " + e.dameSueldo() +  
					" Fecha de Alta: " + e.dameFechaContrato());
			
		}
		
		
		Arrays.sort(misEmpleados);
		
		

	}

}


class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+ gratificacion;
		
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() {
		
		return altaContrato;
		
	}
	
	
	public void subirSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
			
		} 
		
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return -1;
			
		}
		
		return 0;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}



class Jefatura extends Empleado implements Jefes{
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
	
}

package poo;

public interface Trabajadores {
	
	double establece_bonus(double gratificacion); //da igual que pongas public y abstract (los metodos ya lo son por defecto en las interfaces)

	double bonus_base=1500; //es por defecto public static final
}

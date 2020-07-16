
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aleatorios=new int [50];
		
		for (int i=0;i<aleatorios.length;i++) {
			
			aleatorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		
		for (int numeros :aleatorios) {
			
			System.out.print(numeros + " - ");
			
		}
		

	}

}

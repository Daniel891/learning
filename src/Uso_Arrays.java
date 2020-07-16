
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] matriz=new int[5];
		
		matriz[0]=4;
		matriz[1]=5;
		matriz[2]=49;
		matriz[3]=54;
		matriz[4]=426;*/
		
		int [] matriz= {4,5,49,54,456};
		
		System.out.println(matriz[3]);
		
		//for(int i=0;i<5;i++)
		
		for(int i=0;i<matriz.length;i++) {
			
			System.out.println("Valor de la posición " + i +  " = " + matriz[i]);
			
		}

	}

}

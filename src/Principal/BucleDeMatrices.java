package Principal;

public class BucleDeMatrices {
	
	public static void main(String [] args){
		
		int[] matrix = new int[10];// se inicializa la matriz de 10 elementos
		
		matrix[0]=10;
		matrix[1]=2;
		
		System.out.println(matrix[0]);// entre corchetes se ve el indice sero 0
		System.out.println(matrix[1]);// posicion del indice 1
		
		System.out.println("-------------------------------------");
		
		int[][]matrix2=new int[2][2]; // La sintaxis funciona igual
		int matrix3[][]=new int [2][2];// en ambos casos
		
		System.out.println("------------------------------------------");
		
		int [] matrix4 = {2,15,200,100,0,3}; // Otra sintaxis valida para construir una matrix
		
		System.out.println("---------------------------------------");
		
		// Iniciamos con los bucles para matrices
		
		for (int i=0; i<6;i++) {
			System.out.println(matrix4[i]);
		}
		
		// Como saber cuantos elementos tiene la matriz
		
		for(int i=0;i<matrix4.length;i++){
			System.out.println(matrix4[i]);
		}
		
	}

}

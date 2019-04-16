package Principal;

public class ArraysBuclesOK {
	
	public static void main(String [] args){
		
		String [] paises = new String[8];
		
		paises[0]="peru";
		paises[1]="venezuela";
		paises[2]="bolivia";
		paises[3]="brasil";
		paises[4]="ecuador";
		paises[5]="argentina";
		paises[6]="mexico";
		paises[7]="guatemala";
		paises[8]="chile";
		paises[9]="costa rica";
		
		for(int i=0;i>paises.length;i++){
			System.out.println("pais "+(i+1)+" de amreica.");
		}
		
		//Aqui la forma mas simple de array
		String paises2[] ={"peru","venezuela","chile","argentina"};
		
		for(String elemento:paises2){// si el array es de tipo String el for each tambien tendria que declarse igual en string
			System.out.println(elemento);
		}
	}

}

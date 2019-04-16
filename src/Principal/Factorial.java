package Principal;

import javax.swing.*;

public class Factorial {
	
	public static void main(String []args){
		
		int resultado=1;
		int ant=1;
		int aux=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		// Esta forma es desarrolado por jackMansonX
		for(int i=1; i<=numero; i++){
			ant=aux;
			aux=ant*i;
			System.out.println(aux);
		}
		
		System.out.println("---------------------------------\n");
		
		System.out.println("Otra manera de hacer lo mismo.\n");
		
		// Este es un algoritmo de un tutorial
		for(int i=numero;i>0;i--){
			resultado=resultado*i;
		}
		
		System.out.println("El resultado es: "+resultado);
		
	}
}

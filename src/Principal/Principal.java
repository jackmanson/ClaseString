package Principal;

import java.util.Scanner;

public class Principal {
	
	public Principal(){ // constructor
		
	}
	
	public static void main(String args[]){
		
		String nombre = "jack";
		int caracteres = nombre.length();
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("La cantidad de caracteres es "+ caracteres);
		System.out.println("Contando letras de el nombre "+nombre+" que tiene "+ nombre.length()+" letras");
		
		int ultimaLetra=nombre.length();
		
		System.out.println("Posicion de Ultima letra "+(ultimaLetra));
		System.out.println("La ultima letra es "+(nombre.charAt(ultimaLetra-1)));
		
		System.out.println("-----------------------------------------------");
		
		String frase="Hola como estan todos";
		String frase1="Condicional Especial";
		
		String ultima_palavra=frase.substring(6);
		String ultima_frase=frase.substring(2, 7);
		
		System.out.println(ultima_palavra);
		System.out.println(ultima_frase);
		System.out.println(frase1.substring(5, frase1.length())); // el primier valor es lo que no se muestra
		
		System.out.println("----------------------------------------------------------");
		
		String nombre1="jasson";
		String nombre2="jack";
		String nombre3="jack";
		String nombre4="Jack";
		
		System.out.println(nombre1.equals(nombre2));
		System.out.println(nombre2.equals(nombre3));
		System.out.println(nombre3.equals(nombre4));
		System.out.println(nombre3.equalsIgnoreCase(nombre4));
		
		System.out.println("-------------------------------------------------------");
		
		int num1, num2, num3;
		double do1,do2,do3;
		String text1,text2,resul;
		
		do1 = 2.562;
		do2 = 5.168994215;
		
		System.out.println(Math.abs(do2)); // clase estatica: nombre_de_clase.metodo(argumento);
		
		
		
	}

}

package Principal;

import javax.swing.JOptionPane;
// Practica desarrolada por JackMansonX
public class BucleFOR {
	
	public static void main(String []arg){
		
		int arroba=0;
		int punto=0;
		boolean condicion=false;
		
		System.out.println("Ingresar su email: ");
		
		String email = JOptionPane.showInputDialog("Ingrese su direccion de correo electronico: ");
		
		for(int i=0;i<email.length();i++){
			
			if(email.charAt(i)=='@'){
				arroba++;
			}
			
			if(email.charAt(i)=='.'){
				punto++;
			}
			
		}
		
		if(arroba==1 && punto==1){
			System.out.println("El email ingresado es correcto.");
			System.out.println("El email ingresado es: "+email);
		}else{
			System.out.println("El email no es correcto.");
			System.out.println("Se encontrarón "+punto+" puntos.");
			System.out.println("Se encontrarón "+arroba+"arrobas.");
		}
		
	}

}

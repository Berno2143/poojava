package poojava;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuentabancaria cuenta_personal = new cuentabancaria("Bernardino", 1461.14f);
		cuentabancaria cuenta_secundaria = new cuentabancaria();
		
		/*
		 * menu cuenta bancaria
		 * 1. retiro 
		 * 2. deposito
		 * 3. imprimir saldo
		 * 4. Estado de cuenta
		 * 5. agregar beneficiario
		 * 6. salir
		 */
		
		int opcion = 0;
		
	do {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Menu cuenata bancaria: ");
		System.out.println("Ingresa la opcion deseada: ");
		System.out.println("1. retiro");
		System.out.println("2. deposito");
		System.out.println("3. imprimir saldo");
		System.out.println("4. Estado de cuenta");
		System.out.println("5. agregar beneficiario");
		System.out.println("6. salir");
		
	    opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:
				System.out.println("ingrese la cantidad a retirar");
			float monto = leer.nextFloat();
			cuenta_personal.retiros(monto);
			System.out.println("*****************************");
			break;
			
			case 2:
				System.out.println("ingrese la cantidad a depositar");
				float deposito = leer.nextFloat();
				cuenta_personal.depositos(deposito);
				System.out.println("*****************************");
				break;
				
			case 3:
				System.out.println("El monto total de su saldo es: " + 
			    cuenta_personal.consultarsaldo());
				System.out.println("*****************************");
				break;
				
			case 4:
				System.out.println("El beneficiario de la cuenta es: " + 
			    cuenta_personal.beneficiario);
				System.out.println("*****************************");
				break;
			case 5:
				System.out.println("ingrese nombre del beneficiario");
				String nombre = leer.next();
				cuenta_personal.beneficiario = nombre;
				System.out.println("*****************************");
				break;
		}

		} while(opcion != 6); 
		
		
		/*
		cuenta_personal.beneficiario = "Bernardino";
		
		System.out.println("Ingrese un monto a depositar");
		float deposito = leer.nextFloat();
		
		System.out.println("Ingrese un monto a retirar");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es: " + cuenta_personal.consultarsaldo());
		System.out.println(cuenta_personal.beneficiario);
		
		cuentabancaria cuenta_papa = new cuentabancaria();
		cuenta_papa.beneficiario = "Rodolfo";
		System.out.println(cuenta_papa.beneficiario);
		
		*/

	}
}


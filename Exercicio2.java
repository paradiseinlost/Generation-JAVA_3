package Aylajava2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numero;

Scanner leia = new Scanner(System.in);

System.out.println("\nEntre com um numero:");
numero=leia.nextInt();

if (numero%2==0) {
	System.out.println("\nEsse numero � par !");
}
else {
	System.out.println("\nEsse numero � impar!");
}

if(numero>=0) {
	System.out.println("\nE tamb�m � positivo!");
	
}
else {
	System.out.println("\nE tamb�m � negativo!");
	
}





	}

}

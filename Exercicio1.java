package Aylajava2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A;
int B;
int C;
int Soma;
// Aqui eu declarei minhas variaveis .


Scanner leia = new Scanner(System.in);// aqui eu pedi para o Scanner ler a minha variavel.

System.out.println("\nDigite o valor de A:");//aqui eu pedi para o usuario entrar com o valor de A.
A=leia.nextInt();//aqui ele leu com o Scanner l� em cima.

System.out.println("\n Digite o valor de B: ");//aqui eu pedi para o meu usuario entrar com o valor de B.
B=leia.nextInt();// aqui eu pedi para o Scanner ler o valor de B.

System.out.println("\nDigite o valor de C:");// aqui eu pedi para o usuario entrar com o valor de C.
C=leia.nextInt();// aqui eu pedi para o Scanner ler o valor de C.

Soma=(A+B);// aqui ele ir� somar o A+B .

if(Soma>C) { // aqui ele est� comparando se a soma feita acima � maior que C.
	System.out.println("\nA soma � maior que C!");
}
else if(Soma<C) {// aqui ele est� comparando se a soma feita acima � menor que C.
	System.out.println("\nA soma � menor que C!");
	
}

else {
	System.out.println("\nA soma � igual a C !");// aqui ele mostra se a soma acima � igual a C.
	
}
		
		
		
		
	}

}

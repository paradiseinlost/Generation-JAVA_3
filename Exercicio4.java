package Aylajava2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String colaborador;
int cargo;
float salario;
float novoSalario;
float porcentagem;

Scanner leia = new Scanner(System.in);

System.out.println("\n\t\tDigite o nome do Colaborador: ");
colaborador=leia.nextLine();

System.out.println("\n\tDigite o seu Salario: ");
salario=leia.nextFloat();

System.out.println("\n\tInsira o codigo do seu cargo: ");
System.out.println("\n\t 1- Gerente ");
System.out.println("\n\t 2- Vendedor ");
System.out.println("\n\t 3- Supervisor ");
System.out.println("\n\t 4- Motorista ");
System.out.println("\n\t 5- Estoquista ");
System.out.println("\n\t 6- Tecnico de TI ");
cargo=leia.nextInt();


switch (cargo) {

case 1:
	porcentagem=(float) (10.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Gerente");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;

case 2:
	porcentagem=(float) (7.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Vendedor");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;

case 3:
	porcentagem=(float) (9.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Supervisor");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;

case 4:
	porcentagem=(float) (6.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Motorista");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;

case 5:
	porcentagem=(float) (5.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Estoquista");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;
case 6:
	porcentagem=(float) (8.0/100.0);
	novoSalario=salario+(porcentagem*salario);
	System.out.println("\nNome do colaborador: "+colaborador);
	System.out.println("\nCargo do colaborador: Tecnico de TI");
	System.out.println("\nNovo salário do colaborador: "+novoSalario);
break;

}







		
		
		
		
		
	}

}

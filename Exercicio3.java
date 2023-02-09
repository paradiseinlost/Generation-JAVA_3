package Aylajava2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int produto;
int quantidade;
float valorTotal;

Scanner leia= new Scanner(System.in);


	
		System.out.println("\n\t\tMais Q'donald!");
		System.out.println("\nEscolha um item do cardapio:");
		System.out.println("\n1Cachorro Quente = 10,00");
		System.out.println("\n2-X-Salada = 15,00");
		System.out.println("\n3-X-bacon= 20,00");
		System.out.println("\n4-X-tudo = 26,00");
		System.out.println("\n5-Refrigerante Lata= 8,00");
		System.out.println("\n6-Suco natural= 12,00");
	 
		produto=leia.nextInt();
		
		System.out.println("\n Agora digite a quantidade do produto que você deseja?");
		quantidade=leia.nextInt();
		
			
		switch(produto) {
		
		case 1:
			valorTotal=(quantidade*10);
			
			System.out.println("\n você escolheu o cachorro quente!! O valor total da sua compra foi de: "+valorTotal);
		break;
		case 2:
			valorTotal=(quantidade*15);
			System.out.println("\n Você escolheu o x-salada!! O valor total da sua compra foi de: "+valorTotal);
		break;
		case 3:
			valorTotal=(quantidade*20);
			System.out.println("\n Você escolheu o x-bacon!! O valor total da sua compra foi de: "+valorTotal);
		break;
		case 4:
			valorTotal=(quantidade*26);
			System.out.println("\n você escolheu o x-salada!! O valor total da sua compra foi de : "+valorTotal);
		break;
		case 5:
			valorTotal=(quantidade*8);
			System.out.println("\n você escolheu o refrigerante !! O valor total foi de :"+valorTotal);
		break;	
		case 6:
			valorTotal=(quantidade*12);
			System.out.println("\n você escolheu o suco de laranja !! O valor total foi de: "+valorTotal);
		break;
		
		default:
			System.out.println("\nProduto não encontrado !!");
		}

	}

}

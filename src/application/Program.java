package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean valida = true;
		boolean encerra = false;
		int i = 0;

		System.out.println("Informe a capacidade do estacionamento: ");
		int n = sc.nextInt();
		Carro[] car = new Carro[n];

		System.out.println();

		while (encerra == false) {
			
			System.out.println();
			System.out.println("ESTACIONAMENTO");
			System.out.println("Quantidade de carros: ");

			System.out.println();
			System.out.println("O que deseja fazer?");
			System.out.println("1. Exibir todos os carros");
			System.out.println("2. Adicionar carro");
			System.out.println("3. Excluir carro");
			System.out.println("4. Encerrar");
			int choose = sc.nextInt();

			switch (choose) {
			case 1: {
				for (int j=0; j<car.length; j++) {
					if(car[j] != null) {
						System.out.println("Vaga: [" + j + "] - " + car[j]);
					}else {
						System.out.println("Vaga: [" + j + "] - VAZIA");
					}
				}
				break;
			}
			case 2: {
				//ADICIONAR
				
				do {
					
					sc.nextLine();
					System.out.println("Informe o modelo: ");
					String modelo = sc.nextLine();
					System.out.println("Informe o fabricante: ");
					String fabricante = sc.nextLine();
					System.out.println("Informe o cor: ");
					String cor = sc.nextLine();
					System.out.println("Informe o ano: ");
					int ano = sc.nextInt();
					car[i] = new Carro(modelo, fabricante, cor, ano);

					System.out.println();
					System.out.println("Deseja incluir mais um carro?");
					System.out.println("1. SIM");
					System.out.println("2. NAO");
					int option = sc.nextInt();

					if (option == 2) {
						valida = false;
					}
					
					i++;
					
				} while (valida == true && (i<car.length));
				break;
			}
			case 3: {
				//REMOVER
				
				System.out.println("Informe o número da vaga para remover o carro:");
				int option = sc.nextInt();
				System.out.println("Carro abaixo foi removido:");
				System.out.println(car[option]);
				car[option] = null;
				
				break;

			}
			case 4: {
				System.out.println("Programa encerrado !");
				encerra = true;
				System.exit(0);
			}
			default:
				valida = false;
				System.out.println("Valor inválido. Digite novamente");
				System.out.println();
			}

		}

	}

}

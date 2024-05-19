package br.com.erickfreire.inteirosmaioresemenores;

import java.util.Scanner;

public class InteirosMaioresEMenores {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		System.out.print("Digite o quarto valor: ");
		numero4 = entrada.nextInt();
		
		System.out.print("Digite o quinto valor: ");
		numero5 = entrada.nextInt();
		
		if(numero1 > numero2)
			if(numero1 > numero3)
				if(numero1 > numero4)
					if(numero1 > numero5)
						System.out.printf("O número %d é o maior!", numero1);
		
		if(numero2 > numero1)
			if(numero2 > numero3)
				if(numero2 > numero4)
					if(numero2 > numero5)
						System.out.printf("O número %d é o maior!", numero2);
		
		if(numero3 > numero1)
			if(numero3 > numero2)
				if(numero3 > numero4)
					if(numero3 > numero5)
						System.out.printf("O número %d é o maior!", numero3);
		
		if(numero4 > numero1)
			if(numero4 > numero2)
				if(numero4 > numero3)
					if(numero4 > numero5)
						System.out.printf("O número %d é o maior!", numero4);
		
		if(numero5 > numero1)
			if(numero5 > numero2)
				if(numero5 > numero3)
					if(numero5 > numero4)
						System.out.printf("O número %d é o maior!", numero5);
		
		if(numero1 < numero2)
			if(numero1 < numero3)
				if(numero1 < numero4)
					if(numero1 < numero5)
						System.out.printf("\nO número %d é o menor!", numero1);
		
		if(numero2 < numero1)
			if(numero2 < numero3)
				if(numero2 < numero4)
					if(numero2 < numero5)
						System.out.printf("\nO número %d é o menor!", numero2);
		
		if(numero3 < numero1)
			if(numero3 < numero2)
				if(numero3 < numero4)
					if(numero3 < numero5)
						System.out.printf("\nO número %d é o menor!", numero3);
		
		if(numero4 < numero1)
			if(numero4 < numero2)
				if(numero4 < numero3)
					if(numero4 < numero5)
						System.out.printf("\nO número %d é o menor!", numero4);
		
		if(numero5 < numero1)
			if(numero5 < numero2)
				if(numero5 < numero3)
					if(numero5 < numero4)
						System.out.printf("\nO número %d é o menor!", numero5);


	}

}

package lista2;

import java.util.Scanner;

public class PessoaMain {

	public static void main (String[] agrs) {
		Pessoa a =new Pessoa();
		Scanner read = new Scanner(System.in);
		System.out.println("Digite todo seu nome:"); 
		String nome = read.nextLine(); 
		System.out.println("Digite seu CPF:"); 
		String cpf = read.next(); 
		System.out.println("Digite sua idade:"); 
		int idade = read.nextInt(); 
		}

	}



package poo01;
import java.util.Scanner;

public class Num6 {
	
	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[] vetor = new double[10];

        double maior = 0.0;

        int indice = 0;

        for(int i=0;i<10;++i){

                System.out.print("Digite um salário: ");

                vetor[i] = leia.nextDouble();

        }

        for(int i=0;i<10;++i){

                if(vetor[i] > maior){

                        maior = vetor[i];

                        indice = i;

                }

        }

        System.out.println("O índice do maior salário é: "+ indice);

}

}



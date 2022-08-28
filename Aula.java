package aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		//Scanner leitura=new Scanner(System.in); 
		
		//Scanner leitura=new Scanner(System.in);
		
		//System.out.println(" informe algo ");
		
		//String leiaStr=leitura.nextLine();
		
		//System.out.println(leiaStr);
		
		//leitura.close();
		
		
		//System.out.println(" Ola,mundo");
		
		
		
		// lista em java 
		
		List<String>Lista =new ArrayList<>();
		Lista.add(" Bruna");
		Lista.add(" Luana");	 
		Lista.add("Vitiello");
		Lista.add("Natialia");
		
		System.out.println(Lista.size());
		
		System.out.println(Lista.isEmpty());
		
		System.out.println(Lista.toString());
		
		//for( String str : Lista) {
		//	System.out.println(str);
        //}
	
//		for(int i=0; i<Lista.size();i++) {
//			System.out.println(Lista.get(i));
//		}

		int contador=0;
		while(contador <Lista.size()) {
			System.out.println(Lista.get(contador));
			contador++;
		}
	}
	//Testando comit do projeto java
	

}

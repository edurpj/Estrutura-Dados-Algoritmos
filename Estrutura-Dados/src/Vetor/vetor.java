package Vetor;

public class vetor {

	public static void main(String[] args) {
		
		//Cria��o e instanci��o
		
		int [] valores = new int[10];
		System.out.println(valores.length);
		
		int [] notas;
		notas = new int [20];
		System.out.println(notas.length);
		System.out.println("____________");
		
		//Criando valores
		
		valores[0] = 2;
		valores[1] = 9;
		valores[2] = 7;
		valores[3] = 5;
		for(int i = 0; i <= valores.length; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("_________________");
		
		 int [] preco = {3,5,7,1,89,2};
		 System.out.println(preco);
		
		 System.out.println("_________________");
		 
		int tamanho = 10 + 4;
		int [] id = new int[tamanho];
		System.out.println(id.length);
	    
    }	
}

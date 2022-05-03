package Matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Matriz de 2 dimen��es
		int [][] valor = new int [6][2];
		
		double prod;
		String num;
		
		try {
			for(int i = 0; i <6; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.println("Digite o valor" + i + "," + j + ":");
					valor [i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i< 6; i++) {
				prod = 1;
				for(int j = 0; j < 2; j++) {
					prod = prod * valor[i][j];
				}
				System.out.println("Linha" + i + Math.sqrt(prod));
			}
			
		} catch (Exception e) {
			System.out.println("Erro na aplica��o" + e);
		}
		sc.close();
	}

}

package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matriz = new int[n][n];
		
		for(int i = 0;i <  matriz.length; i++) {
			for(int j = 0; j < matriz.length; j ++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matriz");
		for(int i = 0;i <  matriz.length; i++) {
			for(int j = 0; j < matriz.length; j ++) {
				System.out.println(matriz[i][j]);
			}
		}
		sc.close();
	}

}

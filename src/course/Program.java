package course;

import java.util.Scanner;

/**
 * @author Alan gonçalves
 *
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Favor digitar um numero positivo.");
			n = sc.nextInt();
		}
		for (int i = 1; n < i; i++) {
			System.out.println("Digite um numero: ");

		}
		sc.close();
	}
}
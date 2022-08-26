import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos dois numeros e: " + soma);
		
		sc.close();
	}

}

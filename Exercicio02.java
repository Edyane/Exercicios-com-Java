import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x, area;
		
		x = sc.nextDouble();
		
		area = 3.14159 * Math.sqrt(x);
		
		System.out.println("A = " + area);
		
		sc.close();
	}

}

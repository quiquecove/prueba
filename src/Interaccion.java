import java.util.Scanner;

public class Interaccion {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("¿Cual es tu edad? ");
		int edad = in.nextInt();
		System.out.print("¿Cual es tu peso? ");
		double peso = in.nextDouble();
		int edad2 = edad + 1;
		double pesoideal = peso * 0.9;
		System.out.println("El año que viene tendras " + edad2 + " y deberias pesar " + pesoideal);
	}

}

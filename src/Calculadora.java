import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {

		caculateValues();
	}

	static void caculateValues() throws IOException {
		// int a, b;
		// int resulta, results, resultm;
		double num1, num2, res = 0;
		char operacion;
		// float resultd;
		System.out.println("Vamos a realizar un calculo");
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer Numero: ");
		num1 = sc.nextInt();
		System.out.print("Segundo Numero: ");
		num2 = sc.nextInt();

		System.out.println("Dime que operacion quieres realizar (+, -, *, /)");
		operacion = (char) System.in.read();
		switch (operacion) {

		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		}
		System.out.println("El resultado es= " + res);
		/// {write you code here

		// resulta = a + b;
		// results = a - b;
		// resultm = a * b;
		// resultd = a / b;
		/// }

		// System.out.println("El resultado de la suma es= " + resulta);
		// System.out.println("El resultado de la resta es= " + results);
		// System.out.println("El resultado de de multiplicacion es= " + resultm);
		//// System.out.println("El resultado de la division es= " + resultd);
	}

}

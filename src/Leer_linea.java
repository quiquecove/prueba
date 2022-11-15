import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer_linea {

	public static void main(String[] args) throws IOException {
		
		String nombre;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Escribe tu nombre: ");
		nombre = br.readLine();
		System.out.println("Hola "+ nombre + ", como estas?");
		

	}

}

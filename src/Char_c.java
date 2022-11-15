import java.io.IOException;
//no complicarse la vida

public class Char_c {

	public static void main(String[] args) throws IOException {


		System.out.println("Elige 1 2 o 3");
		
		char c = (char) System.in.read();

		System.out.println("has elegido la opcion "+ c);

	}

}

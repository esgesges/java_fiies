import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getstring {  
	public static void main(String[] args) {
		 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 int q = 0;
		 String O;
		 System.out.println("inserisci un numero");
		try {
			q = Integer.parseInt(input.readLine());
		} catch (NumberFormatException | IOException e) {
			System.err.println("errore");
		}
		O = factorial(q);
		System.out.println(O);
	}
	
	
	public static String getStringOfNumbers(int numero)
	{
		String risultato = "";
		while (numero > 0)
		{
			risultato = (numero % 10) + "\t" + risultato;
			numero /=10;
		}
		return risultato;
	}
	
	
	public static String factorial(int a)
	{
		String r = getStringOfNumbers(a);
		return r;
	}
}
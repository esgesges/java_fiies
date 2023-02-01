import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisione {
	public static void main(String[] args) {
			
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n1 = 0, n2 = 0, r = 0;
		
		// RICHIESTA NUMERO 1
		
		try {
			n1 = Integer.parseInt(input.readLine());
		} catch (NumberFormatException ex) {
			System.err.println("errore");
		} catch (IOException ex) {
			System.err.println("errore di input");
		}
		
		//RICHIESTA NUMERO 2
		
		try {
			n2 = Integer.parseInt(input.readLine());
		} catch (NumberFormatException ex) {
			System.err.println("errore");
		} catch (IOException ex) {
			System.err.println("errore di input");
		}
		
		while(n1 > n2)
		{
			n1 -= n2;
			r++;
		}
		System.out.println("Risultato: " + r);
	}
}
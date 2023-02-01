import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LancioDado {
		public static void main(String[] args) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			Random rand = new Random();
			String c = " ";
			
			while(true) {
			System.out.println("Premi un pulsante per lanciare un dado...");
			try {
				c = input.readLine();
			} catch (IOException e) {
				System.err.println("errore di input");
			}
			int userRandom = (rand.nextInt(20)) + 1;
			int botRandom = (rand.nextInt(6)) + 1;
			
			if(!(userRandom == botRandom))
			{
				if(userRandom < botRandom)
				{
					System.out.println("Hai perso :(");
				} else
				{
					System.out.println("Hai vinto! :)");
				}
			} else {
				System.out.println("Pareggio! -_-");
			}
			
			System.out.println("Vuoi giocare ancora? [si/no]");
			do {
			try {
					c = input.readLine();
				} catch (IOException e) {
					System.err.println("errore di input");
				}
			} while(c == "si" || c == "no");
			if(c == "no") {
				break;
			}
		}
	}
}
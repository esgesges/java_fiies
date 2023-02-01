import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SassoCartaForbice {
	public static void main(String[] args) {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();
	int v = 0, s = 0, p = 0;
	String c = " ", c2 = " ";
	while (true) {
	
		
	// RICHIESTA SEGNO
	
		
	do {
	try {
		System.out.println("\t\t\t\t\t" + v + " " + s + " " + p);
		System.out.println("Che segno scegli? (Carta, Sasso, Forbice)");
		c = input.readLine();
	} catch (IOException ex) {
		System.err.println("errore nell'input");
	} catch (NumberFormatException ex){
		System.err.println("errore nell'input");
	}
	} while (c == "Carta" || c == "Sasso" || c == "Forbice" || c == "carta" || c == "sasso" || c == "forbice");
	int int_random = (rand.nextInt(3)) + 1;

	
	
	// RISULTATI
	/*
	1 -> carta
	2 -> sasso
	3 -> forbice
	*/ 
	
	switch(int_random)
	{
	
	case 1:
		System.out.println("L'avversario ha scelto Carta, ");
		
		if (c == "Forbice" || c == "forbice")
		{
			System.out.println("hai vinto! :) (hooray)");
			v++;
		} else if (c == "Sasso" || c == "sasso")
		{
			System.out.println("hai perso! :(");
			s++;
		} else if (c == "Carta" || c == "carta")
		{
			System.out.println("E' un pareggio! -_-");
			p++;
		}
	break;
	
	
	case 2:
		System.out.println("L'avversario ha scelto Sasso, ");
		
		if (c == "Carta" || c == "carta")
		{
			System.out.println("hai vinto! :) (hooray)");
			v++;
		} else if (c == "Forbice" || c == "forbice")
		{
			System.out.println("hai perso! :(");
			s++;
		} else if (c == "Sasso" || c == "sasso")
		{
			System.out.println("E' un pareggio! -_-");
			p++;
		}
	break;
	
	
	case 3:
		System.out.println("L'avversario ha scelto Forbice, ");
		
		if (c == "Sasso" || c == "sasso")
		{
			System.out.println("hai vinto! :) (hooray)");
			v++;
		} else if (c == "Carta" || c == "carta")
		{
			System.out.println("hai perso! :(");
			s++;
		} else if (c == "Forbice" || c == "forbice")
		{
			System.out.println("E' un pareggio! -_-");
			p++;
		}
	break;
	}
	
	
	// REPLAY
	
	
	System.out.println("vuoi giocare ancora? [si/no]");
	do {
	try {
		c2 = input.readLine();
	} catch (IOException e) {
		System.err.println("Errore nell' input");
	}
	} while (c2 == "si" || c2 == "no");
	if (c2 == "no")
	{
		break;
	}
	}
	}
}



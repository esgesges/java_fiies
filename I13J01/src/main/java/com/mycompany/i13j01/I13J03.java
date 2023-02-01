/*
o versione 14/12/22

o classe 3AII

o Ferrian Filippo

o titolo
Classe Dado: simulare il lancio di un dado (6 facce) con visualizzazione del valore della faccia uscita
*/

package com.mycompany.i13j01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class I13J03 {

    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        int quantiDadi = 0;
        int numLanci = 1;
        int estratto = -1;
        int somma = 0;
        Random dado = new Random();
        do {
            System.out.print("Quanti dadi vuoi lanciare? ");
            try {
                quantiDadi = Integer.parseInt(tastiera.readLine());
            } catch (IOException ioe) {
                System.err.println("Errore di lettura!");
            } catch (NumberFormatException nfe) {
                System.err.println("Numero non valido!");
 
            }
        } while (quantiDadi < 1); 
        do {
            estratto = 1 + dado.nextInt(6);
            System.out.println("Lancio del " + numLanci + "\u00b0 dado: " + estratto);
            somma = somma + estratto;
            numLanci = numLanci + 1;
        } while (numLanci <= quantiDadi);
        System.out.println("Somma dei lanci: " + somma);   
    }
    
}

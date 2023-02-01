/*
o versione 14/12/22

o classe 3AII

o Ferrian Filippo

o titolo
2) Classe Orario: dato un tempo in ore (0:23) minuti (0:59) e secondi (0:59), determinare il corrispondente in secondi.

Es.

IN: Ore: 10

Minuti: 30

Secondi: 05

OUT: 37.805
*/
package com.mycompany.i13j01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class I13J02 {

    public static void main(String[] args) {
       int ore = 0,minuti = 0,secondi = 0;
       
       BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
       
       // vari input ( ore, minuti, secondi)
       
       do{
        try {
            System.out.println("Inserisci le ore: ");
            ore = Integer.parseInt(tastiera.readLine());
        } catch (IOException ex) {
            Logger.getLogger(I13J01.class.getName()).log(Level.SEVERE, null, ex);
        }
       } while (ore <= 0);
              do{
        try {
            System.out.println("Inserisci i minuti: ");
            minuti = Integer.parseInt(tastiera.readLine());
        } catch (IOException ex) {
            Logger.getLogger(I13J01.class.getName()).log(Level.SEVERE, null, ex);
        }
       } while (minuti <= 0);
                     do{
        try {
            System.out.println("Inserisci i secondi: ");
            secondi = Integer.parseInt(tastiera.readLine());
        } catch (IOException ex) {
            Logger.getLogger(I13J01.class.getName()).log(Level.SEVERE, null, ex);
        }
       } while (secondi <= 0);
              
       // CALCOLI
       secondi += ore*3600 + minuti*60 ;
       System.out.println("Secondi totali: " + secondi);
    }
    
}

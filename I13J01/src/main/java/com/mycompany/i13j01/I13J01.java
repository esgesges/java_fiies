/*
o versione 14/12/22

o classe 3AII

o Ferrian Filippo

o titolo
Classe Rettangolo: dati la base (intera > 0) e l’altezza (intera > 0) di un rettangolo fornire in output il valore di:

a. Area

b. Perimetro

Es:

IN: 10

3

OUT: Area: 30

Perimetro: 26
*/
package com.mycompany.i13j01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class I13J01 {

    public static void main(String[] args){
        int base = 0, altezza = 0, area, perimetro;
        String Sbase, Saltezza;
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
       do{
        try {
            System.out.println("Inserisci base: ");
            base = Integer.parseInt(tastiera.readLine());
        } catch (IOException ex) {
            Logger.getLogger(I13J01.class.getName()).log(Level.SEVERE, null, ex);
        }
       } while (base <= 0);
       do {
        try {
            System.out.println("Inserisci l'altezza: ");
            altezza = Integer.parseInt(tastiera.readLine());
        } catch (IOException ex) {
            Logger.getLogger(I13J01.class.getName()).log(Level.SEVERE, null, ex);
        }
        } while (altezza <= 0);
        area = base * altezza;
        perimetro = (base * 2) + (altezza * 2);
        System.out.println("Base: " + base + "\nAltezza" + altezza);
    }
    
}
